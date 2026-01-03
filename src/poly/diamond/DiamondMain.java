package poly.diamond;

public class DiamondMain {

    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();
    }

}


//1. `a.methodCommon()` 을 호출하면 먼저 `x001` `Child` 인스턴스를 찾는다.
//2. 변수 `a` 가 `InterfaceA` 타입이므로 해당 타입에서 `methodCommon()` 을 찾는다.
//3. `methodCommon()` 은 하위 타입인 `Child` 에서 오버라이딩 되어 있다. 따라서 `Child` 의 `methodCommon()`이 호출된다.
//4. `b.methodCommon()` 을 호출하면 먼저 `x002` `Child` 인스턴스를 찾는다.
//5. 변수 `b` 가 `InterfaceB` 타입이므로 해당 타입에서 `methodCommon()` 을 찾는다.
//6. `methodCommon()` 은 하위 타입인 `Child` 에서 오버라이딩 되어 있다. 따라서 `Child` 의 `methodCommon()`이 호출된다.