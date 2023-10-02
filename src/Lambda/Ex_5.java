package Lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 컬렉션 프레임워크와 함수형 인터페이스
 * 기존에 컬렉션 프레임워크를 사용했을 때 보다 더 편리하게 출력할 수 있다.
 */

public class Ex_5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        // list의 모든 요소를 출력
        list.forEach(i -> System.out.print(i + ","));
        System.out.println();

        // list에세 2 또는 3의 배수를 제거
        list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
        System.out.println(list);

        // list의 각 요소에 10을 곱하기
        list.replaceAll(i -> i * 10);
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");

        // map의 모든 요소를 키와 값을 출력
        map.forEach((k, v) -> System.out.print("{"+k+","+v+"},"));
        System.out.println();
    }
}
