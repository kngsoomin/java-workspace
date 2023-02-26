package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java"));
        System.out.println(s2.equals("python")); // false, case-sensitive
        System.out.println(s2.equalsIgnoreCase("python")); // case-insensitive

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지 정보
        s2 = "1234"; // 위에서 저장된 메모리 공간을 재사용하는 경우
        System.out.println(s1.equals(s2)); // 내용 비교 (true)
        System.out.println(s1 == s2); // 참조 비교 (true)

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // 내용 비교 (true)
        System.out.println(s1 == s2); // 참조 비교 (false)
    }
}
