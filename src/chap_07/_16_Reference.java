package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본자료형 (Primitive Data Types: int, float, double, long, boolean, ...)
        // 기본자료형의 기본값 -> 0
        // 메소드가 없다.
        // 항상 소문자로 시작한다
        int[] i = new int[3];
        System.out.println(i[0]); // 0

        double[] d = new double[3];
        System.out.println(d[0]); // 0.0

        // 참조 자료형 (Non-Primitive, Reference Data Types) : String, Camera, FactoryCam, SpeedCam, ...
        // 클래스로부터 만들어진 객체
        // 참조 자료형의 기본값, 항상 null
        // 메소드가 있을 수 있다
        String[] s = new String[3];
        System.out.println(s[0]);

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null);

        /////////////////////////////
        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a);
        System.out.println(b);
        b = 30;
        System.out.println(a);
        System.out.println(b);

        System.out.println("=====================");

        Camera c1 = new Camera(); // c1이라는 객체는 이때 생성된 메모리에 있는 어떤 곳을 가리키고 있다
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name);
        System.out.println(c2.name);

        c2 = c1; // 이는 c2가 c1이 가리키고 있는 곳을 가리키게 되는 것
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2.name = "고장난 카메라"; // c1, c2가 가리키고 있는 곳의 이름을 바꾸는 것이라서 c1.name 도 변화하게 됨
        System.out.println(c1.name);
        System.out.println(c2.name);
        // 참조자료형의 경우 값을 주면 참조하는 대상이 변화하게 되는 것
        // 기본자료형처럼 값을 복사해서 주는 거랑은 다르당

        changeName(c2);
        System.out.println(c1.name);
        System.out.println(c2.name);

        c2 = null; // 관계 삭젱~
        System.out.println(c2.name); // NullPointerException
    }
    public static void changeName(Camera camera){
        camera.name = "잘못된 카메라";
    }
}
