package chat_09.user;

public class VIPUser extends User {
    public VIPUser(String name) {
        super("특별한 " + name);
    }

    @Override
    public void addPoint() {
        super.addPoint();
        System.out.println("100포인트가 추가로 적립됩니다.");
    }
}
