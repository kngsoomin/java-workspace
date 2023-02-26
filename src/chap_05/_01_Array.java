package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "카페라떼";
        String coffeeMonica = "카푸치노";

        // 배열 선언 첫 번째 방법
//        String[] coffees = new String[4];

        // 두 번째 방법
//        String coffees[] = new String[4];
//        coffees[0] = "아메리카노";
//        coffees[1] = "카페모카";
//        coffees[2] = "카페라떼";
//        coffees[3] = "카푸치노";

        // 세 번째 방법
//        String[] coffees = new String[] {"아메리카노", "카페모카", "카페라떼", "카푸치노"}; // 이때 배열 길이 specify 하지 않음

        // 네 번째 방법
        String[] coffees = {"아메리카노", "카페모카", "카페라떼", "카푸치노"}; // 이때 배열 길이 specify 하지 않음

        // 커피주문
        System.out.println(coffees[0]);
        System.out.println(coffees[1]);

        // 배열 값 바꾸기
        coffees[2] = "에스프레소";
        System.out.println(coffees[2]);
        System.out.println(coffees[3]);

        // 다른 자료형도 삽가넝
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        double[] d = new double[] {10.0, 11.2, 13.5};
        boolean[] b = {true, false};
    }
}
