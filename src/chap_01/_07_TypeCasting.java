package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        int score = 93;
        System.out.println((float) score);
        System.out.println((double) score);

        // float, double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int) score_f); // 93
        System.out.println((int) score_d); // 98

        // 정수 + 실수 연산
        score = 93 + (int) 93.9; // 186
        System.out.println(score);
        
        score_d = 93 + 98.8; // 정수 + 실수일때는 자동으로 double 로 변환
        
        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 186 -> 186.0
        // int -> long -> float -> double (자동형변환, 따로 바꿔줄 필요없음)
        
        int convertedScoreInt = (int) score_d; // 191.8 -> 191
        // 자동형변환 불가

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(92.8);
        s2 = Double.toString(92.8);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("29");
        System.out.println(i + 10); // 39
        String randomString = "123";
        System.out.println(randomString + 1);

        double d = Double.parseDouble("98.8");
        System.out.println(d);

        int error = Integer.parseInt("JAVA");
    }
}
