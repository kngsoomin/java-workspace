package chap_04;

public class _05_For {
    public static void main(String[] args) {
        System.out.println("어서오세요 또떡입니다");
        for (int i=0; i < 5; i++){
            System.out.println("배달의민족 주문! #" + i);
        }

        // 짝수만 출력 (팁: fori 만 적고 엔터치면 됌)
        System.out.println("짝수만 출력하기");
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }

        // 홀수만 출력
        System.out.println("\n홀수만 출력하기");
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);
        }

        // 거꾸로 숫자 출력하기
        System.out.println();
        System.out.println("거꾸로 숫자 출력하기");
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }

        // 1부터 10까지 수들의 합
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println();
        System.out.println("1부터 10까지의 합: " + sum);
    }
}
