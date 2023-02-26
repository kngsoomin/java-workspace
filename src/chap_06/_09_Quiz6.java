package chap_06;

public class _09_Quiz6 {
    public static String getHiddenData(String strToConvert, int index) {
        String retVal = strToConvert.substring(0, index);
        for (int i = index; i < strToConvert.length(); i++) {
            retVal += "*";
        }
        return retVal;

    }

    public static void main(String[] args) {
        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-2838-2948";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));

    }
}
