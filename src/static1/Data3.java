package static1;

public class Data3 {
    public String name;
    public static int count; //static

    public Data3(String name) {
        this.name = name;
        count++;
    }
}

//static 변수 사용
//특정 클래스에서 공용으로 함께 사용할 수 있는 변수를 만들 수 있다면 편리할 것이다.
//`static` 키워드를 사용하면 공용으로 함께 사용하는 변수를 만들 수 있다.

//기존 코드를 유지하기 위해 새로운 클래스 `Data3` 을 만들었다.
//`static int count` 부분을 보자. 변수 타입(`int` ) 앞에 `static` 키워드가 붙어있다.
//이렇게 멤버 변수에 `static` 을 붙이게 되면 `static` 변수, 정적 변수 또는 클래스 변수라 한다.
//객체가 생성되면 생성자에서 정적 변수 `count` 의 값을 하나 증가시킨다.