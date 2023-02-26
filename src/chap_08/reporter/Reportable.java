package chap_08.reporter;

public interface Reportable {
    // interface에 들어가는 내용은 모두 공통으로
    // public abstract void report()
    // public abstract 이 들어간다

    // 비슷하게 String name = ""의 경우
    // public static final String name = "감지자"
    // public static final 이 들어간다

    void report(); // 신고
}
