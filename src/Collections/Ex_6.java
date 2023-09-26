package Collections;

import java.util.TreeSet;

/**
 * TreeSet
 * 범위 검색과 정렬에 유리한 컬렉션 클래스이다.
 * HashSet보다 데이터 추가, 삭제에 시간이 더 걸린다.
 * TreeSet 같은 경우에는 정렬이 필요하지 않다. (정렬을 해줌)
 */

public class Ex_6 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        int[] number = {4, 12, 50, 99, 42, 31, 28, 65, 70, 83};

        for (int i = 0; i < number.length; i++) {
            set.add(number[i]);
        }

        System.out.println("set = " + set);     // TreeSet은 정렬하면서 저장된다.
        System.out.println("50보다 작은 값 = " + set.headSet(50));       // 50을 포함하지 않음
        System.out.println("50보다 큰 값 = " + set.tailSet(50));       // 50을 포함함
        System.out.println("30과 70사이의 값 = " + set.subSet(30, 70));          // 70을 포함하지 않음
    }
}
