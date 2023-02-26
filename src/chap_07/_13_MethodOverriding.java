package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _13_MethodOverriding {
    public static void main(String[] args) {
        // 메소드 오버로딩: 같은 클래스 내에서 파라메터의 종류를 다르게 하거나 수를 다르게 해서 덮어쓰는 것
        // 메소드 오버라이딩: 부모클래스의 메소드를 자식클래스에서 덮어쓰면서 재정의하는 것, 다시 쓰되 다른 내용을 하고싶엉
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        speedCam.showMainFeature();
        factoryCam.showMainFeature();
    }
}
