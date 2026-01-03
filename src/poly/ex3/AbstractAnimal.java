package poly.ex3;

public abstract class AbstractAnimal {

    public abstract void sound();

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

//`AbstractAnimal` 은 `abstract` 가 붙은 추상 클래스이다. 이 클래스는 직접 인스턴스를 생성할 수 없다.
//`sound()` 는 `abstract` 가 붙은 추상 메서드이다. 이 메서드는 자식이 반드시 오버라이딩 해야 한다.

