package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        // class Person : 사람
        // class Student extends Person : 학생 Student is a Person (역은 성립하지 않음)
        // class Teacher extends Person : 선생님 Teacher is a Person
        // 상속은 is a 관계가 있다

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam: cameras) {
            cam.showMainFeature();
        }

        // 자식클래스만 가지고 있던 메소드는 호출이 안돼
//        factoryCam.detectFire();
//        speedCam.recognizeLicensePlate()
//        speedCam.Speed();

        // instanceof
        if (camera instanceof Camera) {
            System.out.println("카메라입니다");
        }
        if (factoryCam instanceof FactoryCam) {
            ((FactoryCam) factoryCam).detectFire();
        }
        if (speedCam instanceof SpeedCam) {
            ((SpeedCam) speedCam).checkSpeed();
            ((SpeedCam) speedCam).recognizeLicensePlate();
        }

        // 모든 클래스는 Object 클래스를 상속중이여서 이렇게 저장 가넝해
        Object[] objs = new Object[3];
        objs[0] = new Camera();
        objs[1] = new SpeedCam();
        objs[2] = new FactoryCam();

    }
}
