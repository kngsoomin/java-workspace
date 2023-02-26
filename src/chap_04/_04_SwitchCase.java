package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case
        // 1등 전액
        // 2등 반액
        // 3등 반액
        // 그외 장학금 대상 아님

        // if-else 이용한 구문
        int ranking = 1; // 1등
        if (ranking == 1){
            System.out.println("전액 장학금");
        } else if (ranking == 2 | ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 노");
        }
        System.out.println("장학금 조회 완료 #1");

        // Switch 이용한 구문
        /*
        switch (expression) {
            case A: .. 수행할 명령 ....
                break;
            case B: .. 수행할 명령 ...
                break;
        }

        */
        ranking = 3;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("장학금 조회 완료 #2");

        // 중고상품의 등급에 따른ㄹ 가격을 책정 (1급: 최상, 4급: 최하)
        int grade = 2;
        int price = 7000;
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + " 등급 상품의 가격 : " + price + " 원");


        // 범위조건에 대한 경우 if-else
        // 명확한 값 조건이 있는 경우 Switch 구문을 쓰면 좋다






    }
}
