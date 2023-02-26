package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        /*
            String name;
            name = "수민";
        */
        String name = "수민";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A'; // char 은 작은따옴표를 씁니다
        name = "강백호"; // 변수 값 업데이트

        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println(pass);

        double d = 3.14123456789;
        float f = 3.14123456789F; // float 크기가 double 보다 더 작음, 뒤에 f 붙여줘야해 (case insensitive)

        System.out.println(d); // 3.14123456789
        System.out.println(f); // 3.1412346

        // int i = 1000000000000; // <에러> 정수형태 자동으로 int 자료, int 값 범위는 대략 -21억 ~ +21억
        long l = 1000000000000L; // 정수형태 자동으로 int 이기 때문이 l 붙여주어야 한다
        l = 1_000_000_000L; // 읽기 힘드니까 이렇게 해도 됑
        l = 1_000L;
        System.out.println(l);

        /*
        int, long
        float, double
        char, string
        bool
        */
    }
}
