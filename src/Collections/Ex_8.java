package Collections;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.*;

/**
 * Collections
 * 컬렉션을 위한 static 메서드를 제공
 * 컬렉션의 동기화 메서드를 제공한다. - synchronized
 * 변경 불가(readOnly) 컬렉션을 만들 수 있다. - unmodifiable
 * 싱글톤 컬렉션을 만들 수 있다. - singleton
 * 한 종류의 객체만 저장하는 컬렉션을 만들 수 있다. - checked
 *
 */

public class Ex_8 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);

        addAll(list, 1, 2, 3, 4, 5);
        System.out.println("addAll = " + list);     // 데이터 담기

        rotate(list, 2);
        System.out.println("rotate = " + list);     // 오른쪽으로 두 칸씩 이동

        swap(list, 0, 3);
        System.out.println("swap = " + list);       // 지정한 값 교환

        shuffle(list);
        System.out.println("shuffle = " + list);    // 저장된 값의 위치를 임의로 변경

        sort(list, reverseOrder());
        System.out.println("sort(reverseOrder) = " + list);     // 역순으로 정렬

        sort(list);
        System.out.println("sort = " + list);       // 정렬

        int idx = binarySearch(list, 2);
        System.out.println("binarySearch = " + idx);        // 지정된 값의 위치를 반환

        System.out.println("max = " + max(list));       // 현재 리스트에서의 최댓값
        System.out.println("min = " + min(list));       // 현재 리스트에서의 최솟값

        fill(list, 10);
        System.out.println("fill = " + list);       // 지정된 값으로 채우기

        List newList = nCopies(list.size(), 3);     
        System.out.println("newList = " + newList);     // 새로운 리스트에 지정된 값으로 복사하기

        System.out.println(disjoint(list, newList));    // 두 리스트 사이에 공통요소가 없는지 확인 (없으면 true)

        copy(list, newList);
        System.out.println("newList = " + newList);
        System.out.println("list = " + list);       // 왼쪽 리스트를 오른쪽 리스트로 복사하기

        replaceAll(list, 3, 0);
        System.out.println("replaceAll = " + list);     // 바꾸려는 값을 지정된 값으로 교체하기
    }
}
