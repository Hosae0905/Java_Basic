package Lamda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * function 패키지
 * 자주 사용되는 다양한 함수형 인터페이스를 제공해준다.
 *
 */

public class Ex_3 {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> (int)(Math.random() * 100) + 1;      // 입력값이 없고 반환값만 존재한다.
        Consumer<Integer> consumer = i -> System.out.print(i + ", ");           // 입력값이 존재하고 반환값이 없다.
        Predicate<Integer> predicate = i -> i % 2 == 0;                         // 입력값을 주어진 조건을 이용하여 boolean 값을 반환한다.
        Function<Integer, Integer> function = i -> i / 10 * 10;                 // 입력값과 출력값이 존재한다.

        ArrayList<Integer> list = new ArrayList<>();
        makeRandomList(supplier, list);
        System.out.println(list);
        printEvenNum(predicate, consumer, list);
        ArrayList<Integer> newList = doSomething(function, list);
        System.out.println(newList);
    }

    static <T> ArrayList<T> doSomething(Function<T, T> f, ArrayList<T> list) {
        ArrayList<T> newList = new ArrayList<>(list.size());

        for(T i : list) {
            newList.add(f.apply(i));        // function을 수행하여 결과값은 새로운 리스트에 넣는다.
        }

        return newList;
    }

    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, ArrayList<T> list) {
        System.out.print("[");
        for(T i : list) {
            if (p.test(i)) c.accept(i);     // predicate를 통해 조건에 맞는지 확인하고 true값이면 consumer를 수행한다.
        }

        System.out.print("]");
    }

    static <T> void makeRandomList(Supplier<T> s, ArrayList<T> list) {
        for (int i = 0; i < 10; i++) {
            list.add(s.get());      // Supplier로 부터 값을 가져와 리스트에 추가
        }
    }
}
