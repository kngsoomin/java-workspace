package chat_09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // 세트 set
        // (1) 중복을 허용하지 않는다
        // (2) 순서가 보장되지 않는다
        HashSet<String> set = new HashSet<>();

        // 데이터 추가 : 중복된 아이템이 있는 경우 에러가 나진 않지만 저장 안됨
        set.add("삼겹살");
        set.add("쌈장");
        set.add("소금");
        set.add("후추");
        set.add("콜라");
        set.add("삼겹살");
        set.add("삼겹살");
        set.add("깻잎");

        System.out.println("총 구매 상품 수 : " + set.size());
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("--------------------------");


        if (set.contains("삼겹살")){
            System.out.println("이거면 됐슈");
        }

        // 삭제
        System.out.println("총 구매 상품 갯수 (삼겹살 구매 전) : " + set.size());
        set.remove("삼겹살");
        System.out.println("총 구매 상품 갯수 (삼겹살 구매 후) : " + set.size());

        // 전체 삭제
        set.clear();
        if (set.isEmpty()) {
            System.out.println("장바구니에 남은 물건 수 : " + set.size());
            System.out.println("집으로 돌아가쟝");
        }

        // 세트 복습
        HashSet<Integer> intSet = new LinkedHashSet<>();
        intSet.add(1);
        intSet.add(13);
        intSet.add(2);
        intSet.add(-1);
        intSet.add(20);

        for (int i:intSet) {
            System.out.println(i);
        }








    }
}
