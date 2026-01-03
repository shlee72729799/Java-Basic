package poly.diamond;

public class Child implements InterfaceA,InterfaceB
{
    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }
    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }
    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }
}


//`implements InterfaceA, InterfaceB` 와 같이 다중 구현을 할 수 있다. `implements` 키워드 위에 `,`로 여러 인터페이스를 구분하면 된다.
//`methodCommon()` 의 경우 양쪽 인터페이스에 다 있지만 같은 메서드이므로 구현은 하나만 하면 된다