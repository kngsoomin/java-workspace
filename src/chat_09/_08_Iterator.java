package chat_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터

        // List: 인터페이스 ArrayList: 클래스 extends List (다형성에 의해 가능)
        // 인터페이스에서 제공하는 메소드들 사용할 수 있음
        List<String> list = new ArrayList<>();
        list.add("시푸");
        list.add("(알 수 없음)");
        list.add("포");
        list.add("(알 수 없음)");
        list.add("또치");
        list.add("(알 수 없음)");
        list.add("뚜치");
        list.add("(알 수 없음)");

        for (String s:list) {
            System.out.println(s);
        }
        System.out.println("-------------------------");

        Iterator<String> it = list.iterator(); // ctrl + alt + v : return값 있는 경우 생성자 만들어줌
        // 커서 맨 앞에 있음
        System.out.println(it); // java.util.ArrayList$Itr@75b84c92
        System.out.println(it.next()); // 시푸
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println("-------------------------");

        // iterator 는 hasnext 와 많이 쓴다. index 따로 몰라서 언제 멈출지 모르니꽈
        it = list.iterator(); // 커서를 처음위치로 다시 이동
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-------------------------");

        // 데이터 삭제
        it = list.iterator(); // 처음 위치로 ~
        while (it.hasNext()) {
            String s = it.next();
            if (s.contains("알 수 없음")) {
                it.remove(); // 그때의 데이터 삭제
            }
        }
        // 삭제한 데이터의 맨 앞으로 이동, 다시 출력
        it = list.iterator(); // 커서를 처음위치로 다시 이동
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // HashSet
        HashSet<String> set = new HashSet<>();
        set.add("김치찌개");
        set.add("시금치나물");
        set.add("두부무침");
        Iterator<String> itSet = set.iterator();

        while(itSet.hasNext()) {
            System.out.println(itSet.next());
        }

        System.out.println("-----------------------");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("된장찌개", 3500);
        map.put("공기밥", 1000);
        map.put("우렁강된장", 7000);

        // map.iterator(): X
        Iterator<String> itMapKey = map.keySet().iterator();
        while(itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }

        System.out.println("-----------------------");
        Iterator<Integer> itValueKey = map.values().iterator();
        while(itValueKey.hasNext()) {
            System.out.println(itValueKey.next());
        }

        // key, value 같이 출력하고 싶을 때 entrySet()
        System.out.println("-----------------------");
        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while(itMap.hasNext()) {
            System.out.println(itMap.next());
        }

    }
}
