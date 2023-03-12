package chat_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스: 기본 자료형은 지원하지 않음. 참조자료형(e.g. String)만 지원함
        // Wrapper class 있어야 기본자료형 할 수 있엉 like Integer[] instead of int
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("-------------------");
        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    // T: Type, K: Key, V: Value, E: Element
    private static <T> void printAnyArray(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for (String s : sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for (double d : dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] iArray) {
        for (int i : iArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
