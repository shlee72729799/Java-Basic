package constructor;

public class MemberInit
{
    String name;
    int age;
    int grade;

    //추가
    void initMember(String name, int age, int grade) {
        this.name = name;   //1. 오른쪽의 name은 매개변수에 접근
        this.age = age;     //2. name 매개변수의 값 사용
        this.grade = grade; //3. this.은 인스턴스 자신의 참조값을 뜻함, 따라서 인스턴스의 멤버 변수에 접근
    }
}
