package chat_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // Linked List
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        list.add("우그웨이");
        list.add("시푸");
        list.add("포");
        list.add("타이거리스");
        list.add("거위 아빠");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("------------------");
        // 추가
        list.addFirst("타이렁");
        for (String s:list) {
            System.out.println(s);
        }

        System.out.println("------------------");
        list.addLast("마스터 밍궈런");
        for (String s:list) {
            System.out.println(s);
        }

        System.out.println("------------------");
        System.out.println("학생 추가 전 (1) : " + list.get(1));
        list.add(1, "부마스터 비옹쿨라");
        System.out.println("학생 추가 후 (1) : " + list.get(1));

        // 삭제
        System.out.println("------------------");
        System.out.println("학생 제외 전 : " + list.size());
        list.remove(list.size() - 1);
        System.out.println("학생 제외 후 : " + list.size());

        // 처음, 마지막 데이터 삭제
        System.out.println("------------------");
        list.removeFirst();
        list.removeLast();
        System.out.println("학생 제외 후 학생 수 :" + list.size());
        for (String s:list) {
            System.out.print("(" + (list.indexOf(s)+1) + ") ");
            System.out.println(s);
        }

        // 변경 (수강권 양도)
        System.out.println("------------------");
        list.set(0, "또치군");
        System.out.println(list.get(0));

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        // 새 학기
        // 데이터 추가
        list.add("우그웨이");
        list.add("시푸");
        list.add("포");
        list.add("타이거리스");
        list.add("거위 아빠");

        Collections.sort(list);
        for (String s:list) {
            System.out.print(list.indexOf(s) + " : ");
            System.out.println(s);
        }

    }
}
