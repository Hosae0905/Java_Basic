package Optional;

import java.util.Optional;
import java.util.OptionalInt;

/**
 * Optional에는 기본형을 감싸는 래퍼 클래스가 있다.
 * 성능때문에 사용하게 된다.
 */

public class Ex_2 {
    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abcde");
        Optional<Integer> optInt = optStr.map(String::length);
        System.out.println("optStr.get() = " + optStr.get());
        System.out.println("optInt.get() = " + optInt.get());

        int result1 = Optional.of("123")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt).get();

        int result2 = Optional.of("")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt).orElse(-1);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        Optional.of("456").map(Integer::parseInt)
                .ifPresent(x -> System.out.printf("result3 = %d%n", x));

        OptionalInt optInt1 = OptionalInt.of(0);        // 0이 저장된다.
        OptionalInt optInt2 = OptionalInt.empty();           // 빈 객체를 생성한다. --> 실제로 0이 저장된다.

        System.out.println("optInt1 = " + optInt1);
        System.out.println("optInt2 = " + optInt2);

        System.out.println("optInt1.isPresent() = " + optInt1.isPresent());  // 같은 0이라면 어떤 것이 빈 객체인지 모르기 때문에 isPresent로 확인해야 한다.
        System.out.println("optInt2.isPresent() = " + optInt2.isPresent());

        System.out.println("optInt1.getAsInt() = " + optInt1.getAsInt());
//        System.out.println("optInt2.getAsInt() = " + optInt2.getAsInt());     // 예외가 발생함
        System.out.println("optInt1.equals(optInt2) = " + optInt1.equals(optInt2));

    }
}
