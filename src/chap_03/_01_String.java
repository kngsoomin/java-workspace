package chap_03;

public class _01_String {
    public static void main(String[] args) {
        String s = "I like Java and Python and C";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length());

        // 대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // 포함관계
        System.out.println(s.contains("Java"));
        System.out.println(s.contains("java")); // false
        System.out.println(s.contains("C#")); // false
        System.out.println(s.indexOf("Java")); // 7
        System.out.println(s.indexOf("C#")); // 포함되지 않았다면 -1
        System.out.println(s.indexOf("and")); // 처음 만나는 위치 12
        System.out.println(s.lastIndexOf("and")); // 마지막 위치 정보 23
        System.out.println(s.startsWith("I like")); // true or false
        System.out.println(s.endsWith(".")); // true or false

    }
}
