package chat_09;

import java.util.ArrayList;

public class _Quiz_09 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("뚜치", "파이썬"));
        students.add(new Student("또치", "자바"));
        students.add(new Student("구피", "C"));
        students.add(new Student("거북", "자바"));

        System.out.println("자바 수강 중인 학생");
        System.out.println("----------------");
        for (Student s:students) {
            if (s.getCertification() == "자바") {
                System.out.println(s.name);
            }
            if (s.certification.equals("자바")) {
                System.out.println(s.name);
            }
        }
    }
}

class Student {
    String name;
    String certification;

    public Student(String name, String certification) {
        this.name = name;
        this.certification = certification;
    }

    public String getCertification() {
        return certification;
    }

}
