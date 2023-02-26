package chap_07;

public class BlackBox {
    String modelName;
    String resolution;
    int price;
    String color;
    int serialNumber; // 시리얼넘버

    // 클래스 변수 (클래스 모두 같은 값 가짐. 객체.클래스변수보다는 클래스.클래스변수로 접근하는 것을 권장)
    static int counter = 0; // 시리얼 번호를 생성해주는 역할
    static boolean canAutoReport = false; // 자동 신고 기능 // 클래스변수

    // 생성자
    BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버 발급 : " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) {
//        this(); // 위의 기본생성자를 접근하게 된다
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }

    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌감지! 경찰서에 신고완료.");
        } else {
            System.out.println("자동 신고 기능 지원되지 않습니다");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다");
        System.out.println("용량은 " + capacity +"GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) {
            return 9;
        }
        else if (type == 2) {
            return 1;
        }
        return 10;
    }

    // showDateTime 날짜정보 표시여부
    // showSpeed 시간 표시 여부
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다");
        if (showDateTime) {
            System.out.println("영상에 날짜 정보가 표시 됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도 정보가 표시 됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record() {
        record(true, true, 5);
    }

    // 모든객체에 공통적으로 사용되는 메소드 클래스 메소드
    static void callServiceCenter() {
        System.out.println("서비스 센터(1588-0000)으로 연결합니다.");
//        modelName = "test"; //인스턴스 변수는 객체가 만들어져야 만들어지게 때문에 static 변수 내에서 사용할 수 없다
    }

    void appendModelName(String modelName) {
        this.modelName+= modelName;
    }

    // Getter & Setter 값을 가져오고 & 값을 설정하는 메소드
    String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요";
        } else {
        return resolution;
        }
    }
    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        }
        else {
        this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}
