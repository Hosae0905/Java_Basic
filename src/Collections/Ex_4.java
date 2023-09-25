package Collections;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Comparator & Comparable
 * 객체 정렬에 필요한 메서드(정렬 기준 제공)를 정의한 인터페이스
 * Comparable - 기본 정렬기준을 구현하는데 사용
 * Comparator - 기본 정렬기준 외에 다른 기준으로 정렬하고자할 때 사용
 *
 */

public class Ex_4 {
    public static void main(String[] args) {
        String[] str = {"C", "B", "A", "E", "F"};

        Arrays.sort(str);
        System.out.println("str = " + Arrays.toString(str));    // String 클래스는 Comparable을 구현하고 있기 때문에 기본 정렬기준이 가능하다.

        Arrays.sort(str, String.CASE_INSENSITIVE_ORDER);        // 대소문자 구분 없이 정렬한다. (Comparator을 구현하고 있음)
        System.out.println("str = " + Arrays.toString(str));

        Arrays.sort(str, new Descending());     // 역순 정렬
        System.out.println("str = " + Arrays.toString(str));
    }
}

class Descending implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c2.compareTo(c1);
        }
        return -1;
    }
}
