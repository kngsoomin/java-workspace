package chat_09;

import chat_09.coffee.*;
import chat_09.user.User;
import chat_09.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        System.out.println("--------------------");

        CoffeeByName c3 = new CoffeeByName("또치상");
        c3.ready();

        CoffeeByName c4 = new CoffeeByName(34);
        c4.ready();

        System.out.println("--------------------");

        int c4Name = (int) c4.name;
        System.out.println("주문 고객 번호 : " + c4Name);

        String c3Name = (String) c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        System.out.println("--------------------");

        // 이미 자료형을 specify 했기 때문에 따로 형변환 하지 않아도 값이 Integer/String 으로 저장되어있음
        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        Coffee<String> c6 = new Coffee<>("뚜치상");
        c6.ready();

        int c5Name = c5.name;
        String c6Name = c6.name;
        System.out.println(c5Name + c6Name);

        System.out.println("--------------------");
        // User 받아서 클래스 만들기
        // CoffeeByUser 는 User 객체만 받는 Generic class
        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("수민쓰"));
        c7.ready();

        System.out.println("--------------------");
        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("성준쓰"));
        c8.ready();

        System.out.println("--------------------");
        orderCoffee("수밍");
        orderCoffee(36);

        orderCoffee("준", "라떼");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }
    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료 : " + name);
    }
}
