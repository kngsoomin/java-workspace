package chap_06;

public class _03_Return {
    // 호텔 전화번호
    public static String getPhoneNumber() {
        String phoneNumber = "8308-2281";
        return phoneNumber;
    }
    // 호텔 주소
    public static String getAddress() {
        String address = "Pasir Panjang, Singapore";
        return address;
    }
    // 호텔 액티비티
    public static String getPossibleActivity() {
        String activity = "Cooking class";
        return activity;
    }

    public static void main(String[] args) {
        // 반환값, Return
        String phoneNumber = getPhoneNumber();

        System.out.println("그랜드 싱가포르 호텔");
        System.out.println("Tel: " + phoneNumber);
        System.out.println("Address: " +  getAddress());
        System.out.println("Today's activity: " + getPossibleActivity());
    }
}
