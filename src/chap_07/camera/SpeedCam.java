package chap_07.camera;

// SpeedCam is a Camera
public class SpeedCam extends Camera{ // 자식 클래스

    public SpeedCam() {
//        this.name = "과속단속 카메라";
        super("과속단속 카메라");
    }

    @Override
    public void recordVideo(){
        super.recordVideo();
        checkSpeed();
        recognizeLicensePlate();
    }

    public void checkSpeed() {
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate() {
        // 번호 인식
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override // annotation for compiler
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 속도 측정, 차량번호 인식");
    }
}
