package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * HashSet
 * 순서와 중복을 허용하지 않는다.
 * Set인터페이스를 구현한 대표적인 컬렉션 클래스이다.
 * HashSet은 객체를 저장하기전에 기존에 같은 객체가 있는지 확인한다. (equals와 hashCode를 오버라이딩해서 사용한다.)
 * 순서를 유지하고 싶으면 LinkedHashSet 클래스를 사용하면 된다.
 *
 * TreeSet
 * 범위 검색과 정렬에 유리한 컬렉션 클래스이다.
 * HashSet보다 데이터 추가, 삭제에 시간이 더 걸린다.
 */

public class Ex_5 {
    public static void main(String[] args) {
        Object[] objArr = {"1", 1, "2", "2", "3", "3", "3"};    // 중복은 제거되었지만 문자열 1과 숫자 1은 다르게 보기 때문에 같이 출력된다.
        Set set = new HashSet();

        for (int i = 0; i < objArr.length; i++) {
            set.add(objArr[i]);
        }

        System.out.println(set);

        Iterator iterator = set.iterator();     // Iterable을 구현하고 있기 때문에 iterator를 사용할 수 있다.

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        HashSet A = new HashSet();
        HashSet B = new HashSet();

        for (int i = 1; i <= 5; i++) {
            A.add(i + "");
        }

        for (int i = 1; i <= 5; i++) {
            B.add((i + 3) + "");
        }

        System.out.println("A = " + A);
        System.out.println("B = " + B);

//        A.retainAll(B);                          // 교집합
//        System.out.println("A ∩ B = " + A);      // [4, 5]

//        A.addAll(B);                             // 합집합
//        System.out.println("A ∪ B = " + A);      // [1, 2, 3, 4, 5, 6, 7, 8]

        A.removeAll(B);                            // 차집합
        System.out.println("A - B = " + A);        // [1, 2, 3]


    }
}
