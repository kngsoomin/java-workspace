package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        // \n : 줄바꿈
        System.out.println("자바가 \n너무 \n재밌어요");
        // \t : tab
        System.out.println("부추전\t\t8000원");
        System.out.println("김치파전\t\t9000원");
        System.out.println("해물파전\t\t9000원");
        // \\ : \
        System.out.println("C:\\Program Files\\Java");
        // "", ''
        System.out.println("단비 says \"냥\"");
        System.out.println("단비 says \'먕\'");

        char c = 'A';
        c = '\'';
        System.out.println(c);
    }
}
