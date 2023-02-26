package chap_05;

public class _03_MultiDimensionalArray {
    public static void main(String[] args) {
        // 다차원 배열 (2차원 배열)

        // 소규모 영화관 좌석
        // A1 - A5
        // B1 - B5
        // C1 - C5

        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        // 3 x 5 크기의 2차원 배열
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // B2에 접근하려면?
        System.out.println(seats[1][1]);

        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // 없는 값에 접근
//        System.out.println(seats2[0][4]);

        // 3차원 배열 만들기
//        String[][][] marray = new String[][][] {
//                { {}, {}, {} },
//                { {}, {}, {} },
//                { {}, {}, {} }
//        };
//        String[][][] marray2 = new String[3][3][3];
        // marray[0][0][0]
    }
}
