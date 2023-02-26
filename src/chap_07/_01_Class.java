package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍 (OOP : Object-Oriented Programming)
        // 유지보수 용이, 높은 재사용성

        // 차량용 블랙박스
        // 모델명, 해상도, 가격, 색상

        // 우리가 만든 첫 제품
        String modelName = "까망이";
        String resolution ="FHD";
        int price = 200000;
        String color = "블랙";

        // 우리가 만든 신제품
        String modelName2 = "하양이";
        String resolution2 ="UHD";
        int price2 = 400000;
        String color2 = "화이트";

        BlackBox bbox = new BlackBox();
        // BlackBox 클래스로부터 bbox object 생성
        // bbox 객체는 BlackBox의 Instance
    }
}
