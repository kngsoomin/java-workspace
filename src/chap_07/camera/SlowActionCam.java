package chap_07.camera;

public class SlowActionCam{
    public String name;
    public SlowActionCam() {
        this.name = "슬로우 액션 카메라";
    }

    public void makeVideo() {
        System.out.println("자체 개발 비데요");
    }

//    public void makeVideo() {
//        System.out.println(this.name + " : "
//                + this.lens + "로 촬영한 영상을 통해 멋진 슬로우 비디오를 제작합니다.");
//    }
}
