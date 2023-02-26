package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s.replace(" and", ","));
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // . 직전까지 잘라낸다

        // 공백 제거
        s = "         hey   ";
        System.out.println(s.trim());

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2); // JavaPython
        System.out.println(s1 + ", " + s2); // Java, Python
        System.out.println(s1.concat(",").concat(s2));
    }
}
