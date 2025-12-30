package access.a;

public class PublicClassInnerMain {
    public static void main(String[] args) {

    PublicClass publicClass = new PublicClass();
    DefaultClass1 class1 = new DefaultClass1();
    DefaultClass2 class2 = new DefaultClass2();
}
}


//패키지 위치는 `package access.a` 이다. 패키지 위치를 꼭 맞추어야 한다. 주의하자.
//`PublicClass` 는 `public` 클래스이다. 따라서 외부에서 접근할 수 있다.
//`PublicClassInnerMain` 와 `DefaultClass1` , `DefaultClass2` 는 같은 패키지이다. 따라서 접근할 수있다.