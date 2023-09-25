package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/**
 * Iterator | ListIterator | Enumeration
 * 컬렉션에 저장된 데이터를 접근하는데 사용되는 인터페이스
 * Enumeration은 Iterator의 구 버전으로 서로 거의 같다.
 * ListIterator는 Iterator의 접근성을 향상시킨 것이다. (단방향 --> 양방향)
 *
 * Iterator 사용 이유
 * 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화한 것이기 때문이다.
 * 컬렉션에서 iterator()를 호출해서 Iterator를 구현한 객체를 얻어서 사용한다.
 *
 * Map에는 iterator()가 없다.
 * 다른 메서드를 사용해서 값을 가져와야 한다.
 *
 */

public class Ex_2 {
    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList();
        Collection arrayList = new ArrayList();     // Collection은 List와 Set의 조상이기 때문에 이렇게 사용할 수 있다.
                                                    // 나중에 컬렉션이 변경되었을 경우 코드를 검토해야 하지만 Collection으로 처음부터 사용하면
                                                    // 변경되어도 메서드를 사용할 수 있다.

        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");

        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }

        /*while (iterator.hasNext()) {      // iterator는 한 번 사용하면 없어지기 때문에 다시 iterator를 다시 만들어서 사용해야한다.
            Object obj = iterator.next();
            System.out.println(obj);
        }*/

        /*for (int i = 0; i < arrayList.size(); i++) {      // ArrayList가 HashSet으로 바뀐다고 하면 사용할 수 없다.
            Object obj = arrayList.get(i);
            System.out.println(obj);
        }*/
    }
}
