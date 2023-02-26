package chap_05;

public class _06_Quiz05 {
    public static void main(String[] args) {
        int[] sizes = new int[10];

        int size = 250;
        for (int i = 0; i < sizes.length; i++) {
            sizes[i] = size;
            size += 5;
        }

        for (int item: sizes) {
            System.out.println("사이즈 " + item + " (재고있음)");
        }

    }
}
