package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 한라봉 에이드 있음 그거, 없으면 망고주스, 오렌지주스, 그거도 없으면 아아
        boolean hallabongAde = false;
        boolean mangoJuice = true;
        boolean orangeJuice = true;

        if (hallabongAde){
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고주스 +1");
        } else if (orangeJuice) {
            System.out.println("오렌지주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
    }
}
