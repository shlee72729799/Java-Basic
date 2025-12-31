package static2;

public class DecoUtil2 {

    public static String deco(String str) {
        String result = "*" + str + "*";
        return result;
    }

}


//`DecoUtil2` 는 앞선 예제와 비슷한데, 메서드 앞에 `static` 이 붙어있다. 이 부분에 주의하자.
// 이렇게 하면 정적 메서드를 만들 수 있다. 그리고 이 정적 메서드는 정적 변수처럼 인스턴스 생성 없이 클래스 명을 통해서 바로 호출할 수 있다