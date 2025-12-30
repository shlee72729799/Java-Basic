package access.b;

//import access.a.DefaultClass1;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        //다른 패키지 접근 불가
       // DefaultClass1 class1 = new DefaultClass1();
       // DefaultClass2 class2 = new DefaultClass2();
    }

}


//`PublicClass` 는 `public` 클래스이다. 따라서 외부에서 접근할 수 있다.
//`PublicClassOuterMain` 와 `DefaultClass1` , `DefaultClass2` 는 다른 패키지이다. 따라서 접근할 수없다.