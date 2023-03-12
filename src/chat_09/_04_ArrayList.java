package chat_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    // 컬렉션 프레임워크: 두개 이상의 데이터를 저장할 때 사용했던 Array,...
    public static void main(String[] args) {
        // 컬렉션 프레임워크 (List, Set, Map)
        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        // 데이터 삭제
        System.out.println("신청 학생 수 (이사 전) : " + list.size());

        list.remove("박명수");

        System.out.println("신청 학생 수 (이사 후) : " + list.size());

        System.out.println("남은 학생 수 (제외 전) : " + list.size());
        list.remove(list.size() - 1);
        System.out.println("남은 학생 수 (제외 후) : " + list.size());

        // 순회
        for (String s:list) {
            System.out.println(s);
        }

        // 데이터 변경 (수강권 양도)
        System.out.println("수강권 양도 전 : " + list.get(0));
        list.set(0, "고슴도치 씨");
        System.out.println("수강권 양도 후 : " + list.get(0));

        // 인덱싱
        System.out.println(list.indexOf("고슴도치 씨"));

        // 선착순 5명 내에 포함되었는가?: 결과값 Boolean
        if (list.contains("거북 씨")) {
            System.out.println("거북 씨는 이 수업을 들어요");
        } else {
            System.out.println("거북 씨는 이 수업을 듣지 않아요");
        }

        // 전체 삭제
        list.clear();

        if (list.isEmpty()) {
            System.out.println("학생 수 : " + list.size());
            System.out.println("모두 떠났습니다.");
        }

        // 다음 학기에 새로 공부 시작
        list.add("우그웨이");
        list.add("시푸");
        list.add("포");
        list.add("타이거리스");
        list.add("거위 아빠");

        // 정렬
        Collections.sort(list);
        for (String s:list) {
            System.out.print(s);
            System.out.println(";");
        }
    }
}
