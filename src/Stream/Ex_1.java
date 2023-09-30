package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 스트림
 * 다양한 데이터 소스를 표준화된 방법으로 다루기 위한 것
 * 데이터 소스는 컬렉션을 뜻함
 * 원래 컬렉션에서는 통합이 안되어 있었는데 stream을 통해 통합을 이뤄냈다.
 * n번의 중간연산을 거쳐서 1번의 최종연산을 한다.
 *
 * 스트림이 제공하는 기능 - 중간 연산과 최종 연산
 * 중간 연산 - 연산결과가 스트림인 연산. 반복적으로 적용가능
 * 최종 연산 - 연산결과가 스트림이 아닌 연산. 단 한 번만 적용가능(스트림의 요소를 소모)
 *
 * 스트림의 특징
 * 스트림은 데이터 소스로부터 데이터를 읽기만할 뿐 변경하지 않는다. --> 원본 유지
 * 스트림은 Iterator처럼 일회용이다. (필요하면 다시 스트림을 생성해야 함)
 * 최종 연산 전까지 중간연산이 수행되지 않는데. - 지연된 연산
 * 지연된 연산은 스트림이 어떤 작업을 할지 표시만 하고 실제 작업은 나중에 한다.
 * 스트림은 작업을 내부 반복으로 처리한다.
 * 병렬 스트림으로 스트림의 작업을 병렬로 처리할 수 있다.
 * 기본형 스트림으로 오토박싱 & 언박싱의 비효율이 제거된다.
 * 숫자와 관련된 유용한 메서드를 Stream<T>보다 더 많이 제공한다.
 *
 * 스트림 만들기 - 컬렉션
 * Collection인터페이스의 stream()으로 컬렉션을 스트림으로 변환
 * 스트림 만들기 - 배열
 * 객체 배열은 Stream.of메서드나 Arrays를 사용해서 스트림을 만들 수 있다.
 * 기본형 배열은 IntStream을 이용해서 만든다.
 *
 * 스트림 만들기 - 임의의 수
 * 난수를 요소로 갖는 스트림 생성하기
 * 스트림에는 유한 스트림과 무한 스트림이 있다.
 * 무한 스트림으로 난수를 만들 수 있다.
 * 범위를 지정해서 스트림을 생성할 수도 있다.
 *
 * 스트림 만들기 - 람다식
 * 람다식을 소스로 하는 스트림을 생성할 수 있다.
 * iterate()는 이전 요소를 seed로 해서 다음 요소를 계산한다.
 * 기본적으로 무한 스트림이기 때문에 limit으로 제한을 둬야 한다.
 * generate()는 seed를 사용하지 않는다.
 *
 */

public class Ex_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }

        Stream<Integer> streamTest = list.stream();     // list로부터 stream을 생성
//        streamTest.forEach(System.out::print);
//        streamTest.forEach(System.out::print);      // stream은 한 번만 사용할 수 있기 때문에 두 번 실행하면 에러가 발생한다.

//        Stream<String> strStream = Stream.of("a", "b", "c");        // 인자로 값을 줄 수 있다.
//        Stream<String> strStream = Stream.of( new String[] {"a","b","c","d"});        // 가변 인자로 줄 수 있다.
        Stream<String> strStream = Arrays.stream(new String[]{"a", "b", "c"});          // Arrays로 stream을 만들 수 있다.
        strStream.forEach(System.out::println);

        /*int[] intArr = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(intArr);
        intStream.forEach(System.out::print);*/

        Integer[] intArr = {1,2,3,4,5};
        Stream<Integer> intStream = Arrays.stream(intArr);      // Stream을 사용하려면 기본형이 아닌 객체 타입으로 바꿔줘야 한다.
//        intStream.forEach(System.out::print);
//        System.out.println("intStream.count() = " + intStream.count());       // Stream에는 count 메서드밖에 없다.

        int[] intArr1 = {1,2,3,4,5};
        IntStream intStream1 = Arrays.stream(intArr1);
//        System.out.println("intStream1.count() = " + intStream1.count());     // IntStream은 sum이나 average같은 다른 메서드도 지원한다. (정수인 것을 이미 알고있기 때문에)
//        System.out.println("intStream1.sum() = " + intStream1.sum());
//        System.out.println("intStream1.average() = " + intStream1.average());

        IntStream intStream2 = new Random().ints();
//        intStream2.limit(5).forEach(System.out::println);       // limit으로 출력 값의 개수를 조절할 수 있다.

        IntStream intStream3 = new Random().ints(5, 10); // 값의 범위를 지정할 수 있다.
//        intStream3.limit(5).forEach(System.out::println);

        Stream<Integer> intStream4 = Stream.iterate(0, n -> n + 2);     // seed로 초기값을 정한다.
//        intStream4.limit(10).forEach(System.out::println);

        Stream<Integer> generateStream = Stream.generate(() -> 1);      // Supplier가 들어오기 때문에 입력값이 없고 출력 값만 있다.
        generateStream.limit(10).forEach(System.out::println);

    }
}
