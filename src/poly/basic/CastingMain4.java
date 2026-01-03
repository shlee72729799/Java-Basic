package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();               //문제 없음

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;     //런타임 오류 - ClassCastException
        child2.childMethod();               //실행 불가
    }
}

//<다운캐스팅은 잘못하면 심각한 런타임 오류가 발생할 수 있다.>
//먼저 `new Parent()`로 부모 타입으로 객체를 생성한다. 따라서 메모리 상에 자식 타입은 전혀 존재하지 않는다.
// 생성 결과를 `parent2` 에 담아둔다. 이 경우 같은 타입이므로 여기서는 문제가 발생하지 않는다.
//다음으로 `parent2` 를 `Child` 타입으로 다운캐스팅한다. 그런데 `parent2` 는 `Parent`로 생성이 되었다.
// 따라서 메모리 상에 `Child` 자체가 존재하지 않는다. `Child` 자체를 사용할 수 없는 것이다.
//자바에서는 이렇게 사용할 수 없는 타입으로 다운캐스팅하는 경우에 `ClassCastException` 이라는 예외를 발생시킨다.
//예외가 발생하면 다음 동작이 실행되지 않고, 프로그램이 종료된다. 따라서 `child2.childMethod()` 코드 자체가 실행되지 않는다.