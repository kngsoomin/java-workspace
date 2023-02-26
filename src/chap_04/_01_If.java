package chap_04;

public class _01_If {
    public static void main(String[] args) {
        int hour = 15; // 오후 10시
        if (hour < 14)
            System.out.println("중괄호 없이도 되지롱");

        if (hour < 14) {
            System.out.println("아이스 아메리카노 + 1");
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료");

        // 오후 2시 이전, 모닝 ㅓ피를 마시지 않은 경우
        hour = 10;
        boolean morningCoffee = false;
        if (hour < 14 && !morningCoffee){
            System.out.println("너.. 괜찮니?");
        }
        System.out.println("커피 주문 완료");

        // 오후 2시 이후이거나 모닝커피를 마신 경우
        hour = 15;
        morningCoffee = true;
        if (hour >= 15 || morningCoffee){
            System.out.println("디카페인 하나 주숑");
        }
    }
}
