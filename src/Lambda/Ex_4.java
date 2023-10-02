package Lambda;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Predicate의 결합
 * and(), or(), negate()로 두 predicate를 하나로 결합할 수 있다.
 * 등가 비교를 위한 Predicate의 작성에는 isEqual()를 사용한다.
 */

public class Ex_4 {
    public static void main(String[] args) {
        Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
        Function<Integer, String> g = (i) -> Integer.toBinaryString(i);     // 함수를 연결하려면 A함수의 출력값과 B함수의 입력값이 같아야 한다.

        Function<String, String> h = f.andThen(g);      // 함수를 연결하기 위한 메서드로 andThen을 사용한다.
        Function<Integer, Integer> h2 = f.compose(g);   // andThen을 반대로 생각해보면 된다.

        System.out.println(h.apply("FF"));      // "FF" -> 255 -> "11111111"
        System.out.println(h2.apply(2));        // 2 -> "10" -> 16

        Function<String, String> f2 = x -> x;       // 입력받은 값을 반환하는 것을 항등함수라고 한다.
        System.out.println(f2.apply("AAA"));     // AAA가 출력된다.

        Predicate<Integer> pTest1 = i -> i < 100;
        Predicate<Integer> pTest2 = i -> i < 200;
        Predicate<Integer> pTest3 = i -> i % 2 == 0;
        Predicate<Integer> notP = pTest1.negate();      // i > 100
        Predicate<Integer> all = notP.and(pTest2.or(pTest3));   // i > 100 && (i < 200 || i % 2 == 0)
        System.out.println(all.test(150));

        String str1 = "abc";
        String str2 = "abc";
        String str3 = "ABC";
        String str4 = new String("abc");

        Predicate<String> pTest4 = Predicate.isEqual(str1);
        System.out.println(pTest4.test(str4));      // str3로 비교하면 false가 나온다.
                                                    // equals를 사용하기 때문에 값을 비교하게 되고 str4와 비교해도 true가 나온다.

    }
}
