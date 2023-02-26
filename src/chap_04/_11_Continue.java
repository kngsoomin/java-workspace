package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님 중 노쇼 있다고 가정
        int max = 20; // 최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; // 17번 손님 노쇼고객
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 치킨 가져가");
            if (i == noShow){
                System.out.println(i + "번 노쇼!");
                continue;
            }
            sold++;
            if (sold == max){
                System.out.println("금일 재료 모두 소진");
                break;
            }
        }

        System.out.println();

        // While
        int index = 0;
        sold = 0; // 현재 치킨 판매 수량

        while (index < 50){
            index++;
            System.out.println(index + "번 치킨 가져가");
            if (index == noShow){
                System.out.println(index + "번 노쇼!");
                continue;
            }
            sold++;
            if (sold == max){
                System.out.println("Sold Out!");
                break;
            }
        }
        System.out.println("영업종료");
    }
}
