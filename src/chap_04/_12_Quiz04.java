package chap_04;

public class _12_Quiz04 {
    public static void main(String[] args) {
        int hour = 10;
        boolean smallCar = false;
        boolean disabled = true;

        int total = hour * 4000;
        int max_total = 30000;
        if (total >= max_total){
            total = max_total;
        }
        if (smallCar || disabled){
            total /= 2;
        }
        System.out.println("주차 요금은 " + total + "원 입니다.");

    }
}
