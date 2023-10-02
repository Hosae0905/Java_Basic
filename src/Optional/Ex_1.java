package Optional;

import java.util.Optional;

/**
 * Optional
 * T 타입 객체의 래퍼 클래스
 * 모든 종류의 객체를 저장할 수 있다.
 * 성능이 좀 느려진다는 단점이 있다.
 * 
 * Optional을 사용하는 이유
 * null을 직접 다루는 건 위험하기 때문에 --> 예외가 발생할 수 있어서
 * Optional을 사용해서 null을 간접적으로 다룰 수 있다.
 * null체크를 하려면 if문을 필수로 해줘야 하는데 이러면 코드가 지저분해진다. --> Optional로 해결
 * 
 * null대신 빈 Optional<T> 객체를 사용하는 것이 좋다.
 *
 */

public class Ex_1 {
    public static void main(String[] args) {
//        int[] arr = null;     // null로 초기화를 하면 예외가 발생하게 된다.
        int[] arr = new int[0];
        System.out.println("arr.length = " + arr.length);

//        Optional<String> opt = null;      // 에러는 발생하지 않지만 바람직하지 않음
//        Optional<String> opt = Optional.empty();        // 이게 더 좋은 방법
        Optional<String> opt = Optional.of("abc");
        System.out.println("opt = " + opt);
//        System.out.println("opt = " + opt.get());       // 값을 가져온다. --> 잘 안 쓰는 방법

        String str = "";

        /*try {             // 이렇게 예외를 처리하면 너무 번거로워진다.
            str = opt.get();
        } catch (Exception e) {
            str = "";
        }

        System.out.println("str = " + str);*/

//        str = opt.orElse("EMPTY");       // orElse를 사용해서 효과적으로 코드의 수를 줄일 수 있다.
//        str = opt.orElseGet(() -> "EMPTY");     // 람다식으로 사용할 수 있다.
        str = opt.orElseGet(String::new);     // 매서드 참조로 바꿀 수 있다.
        System.out.println("str = " + str);
    }
}
