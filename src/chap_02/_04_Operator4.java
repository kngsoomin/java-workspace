package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = true;
        boolean 제육볶음 = true;
        boolean 계란말이 = false;

        System.out.println(김치찌개 || 제육볶음 || 계란말이); // 하나라도 true 면 true
        System.out.println(김치찌개 && 제육볶음 && 계란말이);

        System.out.println((5 >= 3) && (3 > 1));
        System.out.println((5 > 3) || (3 < 1));

        // 논리 부정 연산자
        System.out.println(!true);
    }
}
