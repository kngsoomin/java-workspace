package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + "나왔어용");
        }

        // enhanced for (for-each) 반복문
        for (String coffee : coffees) {
            System.out.println(coffee);
        } //foreach
    }
}
