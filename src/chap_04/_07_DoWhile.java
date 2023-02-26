package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 Do While
        int distance = 25;
        int move = 0;
        int height = 2;
        while (move + height < distance) {
            System.out.println("발차기를 계속 함다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착했슴다.");
        System.out.println(" --- 반복문 #1 --- ");

        move = 0;
        height = 25;
        while (move + height < distance) {
            System.out.println("발차기를 계속 함다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착했슴다.");
        System.out.println(" --- 반복문 #2 --- ");

        // Do while 반복문, 조건을 먼저 보지 않고 일단 do 먼저 한다, 그 후 조건 확인 하고
        // 반복할 지 결정, 즉 최소 한번은 무조건 시행한다
        move = 0;
        height = 25;
        do {
            System.out.println("발차기를 계속함다");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        } while (move + height < distance);
        System.out.println(" --- 반복문 #3 --- ");

    }
}
