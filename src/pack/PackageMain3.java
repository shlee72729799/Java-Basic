package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {

        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }

}
//같은 이름의 클래스가 있다면 `import` 는 둘중 하나만 선택할 수 있다. 이때는 자주 사용하는 클래스를 `import` 하고
//나머지를 패키지를 포함한 전체 경로를 적어주면 된다. 물론 둘다 전체 경로를 적어준다면 `import` 를 사용하지 않아도 된다.