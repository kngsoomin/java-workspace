package chat_09;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵 (key, value)
        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 추가
        map.put("또치", 10);
        map.put("뚜치", 3);
        map.put("구피", 2);

        System.out.println("총 고객 수 : " + map.size());
        System.out.println("-------------------------");

        // 조회
        System.out.println("또치 님의 누적 포인트 : " + map.get("또치"));
        System.out.println("뚜치 님의 누적 포인트 : " + map.get("뚜치"));
        System.out.println("구피 님의 누적 포인트 : " + map.get("구피"));
        System.out.println("-------------------------");

        // 확인 with contains key
        if (map.containsKey("옹쿨라")){
            int pnt = map.get("옹쿨라");
            map.put("옹쿨라", ++pnt);
            System.out.println("옹쿨라 님의 누적 포인트 : " + map.get("옹쿨라"));
        } else {
            map.put("옹쿨라", 1);
            System.out.println("옹쿨라 님 신규가입 완료. 현재 포인트 : " + map.get("옹쿨라"));
        }
        System.out.println("-------------------------");

        // 삭제
        map.remove("구피");
        System.out.println(map.get("구피")); // 삭제된 키를 가져오려고 했을 때, returns null
        System.out.println("-------------------------");

        // 전체 삭제
        map.clear();
        if (map.isEmpty()) {
            System.out.println("남은 고객 수 : " + map.size());
            System.out.println("장사 접습니다.");
        }
        System.out.println("-------------------------");

        // 신규 고객
        // 데이터 추가
        map.put("또치", 30);
        map.put("뚜치", 23);
        map.put("구피", 12);

        // Key 롹인 (순서 보장 안 됌, key 값 중복도 안 됌)
        for (String key: map.keySet()){
            System.out.print(key + " : ");
            System.out.println(map.get(key));
        }
        System.out.println("-------------------------");

        // Value 값 확인
        for (int value: map.values()) {
            System.out.println(value);
        }
        System.out.println("-------------------------");

        // key, value 함께 확인
        for(String key : map.keySet()) {
            System.out.println("고객 이름 : " + key + "\t포인트 : " + map.get(key));
        }
        System.out.println("-------------------------");

        // 맵 중복 x 순서 x
        map.put("거북", 10);
        map.put("거북", 30);
        map.put("거북", 50); // 이 값이 들어가게 됨

        for(String key : map.keySet()) {
            System.out.println("고객 이름 : " + key + "\t포인트 : " + map.get(key));
        }



    }
}
