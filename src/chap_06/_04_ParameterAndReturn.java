package chap_06;

public class _04_ParameterAndReturn {
    public static int getPower(int number) {
        return number * number;
    }
    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 전달값과 반환값이 있는 메소드
        int retVal = getPower(11);
        System.out.println(retVal);

        System.out.println(getPowerByExp(4, 4));
    }
}