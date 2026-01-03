package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent)
    {
        parent.parentMethod();
        if (parent instanceof Child)
        {
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}
//변수가 참조하는 **인스턴스의 타입을 확인**하고 싶다면 `instanceof` 키워드를 사용하면 된다.