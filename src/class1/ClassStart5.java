package class1;

public class  ClassStart5 {


    public static void main(String[] args) {

        Student student1;               //Student 변수 선언
        student1 = new Student();       //Student 인스턴스 생성
        student1.name="학생1";
        student1.age=15;
        student1.grade=90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age=16;
        student2.grade=80;


        Student[] students = new Student[]{student1, student2};  //생성과 선언을 동시에 하는 경우 다음과 같이 더 최적화 할 수 있다.

        //for문 적용
        for (int i = 0; i < students.length; i++) {
            System.out.println("이름:" + students[i].name +
                               "나이:" + students[i].age +
                               "성적:" + students[i].grade);
        }

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름:" + s.name + " 나이:" + s.age + "성적"+s.grade);
        }

        //**향상된 for문(Enhanced For Loop)** iter
        for (Student s : students) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }



    }

}



