package poly.ex5;

public interface InterfaceAnimal {
    void sound();
    void move();
}


//인터페이스는 `class` 대신에 `interface`로 선언하면 된다.
//`sound()` , `move()` 는 앞에 `public abstract` 가 생략되어 있다.
//따라서 상속 받는 곳에서 모든 메서드를 오버라이딩 해야 한다.