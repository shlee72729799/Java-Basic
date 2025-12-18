package class1;

public class ClassStart4 {


    public static void main(String[] args) {

        Student student1;   //Student 변수 선언
        student1 = new Student();   //Student 인스턴스 생성
        student1.name="학생1";
        student1.age=15;
        student1.grade=90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age=16;
        student2.grade=80;


        Student[] students =new Student[2];   //`student1`,`student2`에는 참조값이 보관되어 있다. 따라서 이 참조값이 배열에 저장된다.
        students[0]= student1;                //student2`에 보관된 참조값을 읽고 복사해서 배열에 대입한다고 표현한다.
        students[1]= student2;                //자바에서 대입은 항상 변수에 들어 있는 값을 복사한다.**



        System.out.println("이름:"+students[0].name+"나이:"+students[0].age+"성적:"+students[0].grade);
        System.out.println("이름:"+students[1].name+"나이:"+students[1].age+"성적:"+students[1].grade);









    }

}
