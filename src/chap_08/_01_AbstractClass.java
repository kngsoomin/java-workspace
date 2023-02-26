package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction)
        // abstract
        // 추상 클래스 (아직 완성되지 않은 클래스): 그 자체로 객체를 만들수없어
        // 추상 메소드 (추상 클래스, 인터페이스에서 사용가능한 껍데기만 있는 메소드)

//        Camera camera = new Cemera(); // 추상 클래스로는 객체 만들 수 없어
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.showMainFeature();
        speedCam.showMainFeature();
    }
}
