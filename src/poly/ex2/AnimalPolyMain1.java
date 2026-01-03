package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    //동물이 추가 되어도 변하지 않는 코드
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}


//이 코드의 핵심은 `Animal animal` 부분이다.
//**다형적 참조** 덕분에 `animal` 변수는 자식인 `Dog` , `Cat` , `Caw` 의 인스턴스를 참조할 수 있다. (부모는 자식을 담을 수 있다)
//**메서드 오버라이딩** 덕분에 `animal.sound()` 를 호출해도 `Dog.sound()` , `Cat.sound()` ,
//`Caw.sound()` 와 같이 각 인스턴스의 메서드를 호출할 수 있다.
// 만약 자바에 메서드 오버라이딩이 없었다면 모두 `Animal` 의 `sound()` 가 호출되었을 것이다.
