package Stream;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 스트림의 최종 연산
 * 스트림의 요소를 소모하기 때문에 최종 연산은 1번만 실행한다.
 * 최종 연산 후 스트림이 닫히게 된다.
 *
 * forEach()
 * 스트림의 모든 요소에 지정된 작업을 수행한다.
 * 병렬 스트림으로 처리할 때 순서가 보장되는 forEachOrdered()도 있다.
 * 기본적으로 직렬 스트림으로 수행하고 병렬로 처리하려면 parallel()로 처리해줘야 한다.
 *
 * 스트림의 최종 연산 - 조건 검사
 * allMatch
 * - 모든 요소가 조건을 만족시키면 true
 * anyMatch
 * - 한 요소라도 조건을 만족시키면 true
 * noneMatch
 * - 모든 요소가 조건을 만족시키지 않으면 true
 * 
 * findFirst, findAny
 * - 조건에 일치하는 요소 찾기
 *
 * reduce
 * - 스트림의 요소를 하나씩 줄여가며 누적연산을 수행한다.
 * reduce에 필요한 인자
 * identity - 초기값
 * accumulator - 이전 연산결과와 스트림의 요소에 수행할 연산
 * combiner - 병렬처리된 결과를 합치는데 사용할 연산(병렬 스트림)
 */

public class Ex_5 {
    public static void main(String[] args) {
        String[] strArr = {
                "Inheritance", "Java", "Lambda", "Stream",
                "OptionalInt", "IntStream", "count", "sum"
        };

        Stream.of(strArr).forEach(System.out::println);
//        Stream.of(strArr)         // 병렬처리시 순서를 유지할 경우
//                .parallel()
//                .forEachOrdered(System.out::println);

        boolean noneEmptyStr = Stream.of(strArr).noneMatch(s -> s.length() == 0);
        Optional<String> sWord = Stream.of(strArr)
                .filter(s -> s.charAt(0) == 's').findFirst();       // 찾을 때 소문자/대문자 구분한다.

        System.out.println("noneEmptyStr = " + noneEmptyStr);
        System.out.println("sWord = " + sWord.get());

        // Stream<String>을 Stream<Integer>로 변환한다.
        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);      // mapToInt는 기본형 int로 변환해준다. --> 성능이 더 빠름
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

        int count = intStream1.reduce(0, (a, b) -> a + 1);      // 최종 연산은 한 번밖에 실행되지 않는다.
        int sum = intStream2.reduce(0, (a, b) -> a + b);

        OptionalInt max = intStream3.reduce(Integer::max);      // 초기값이 없기 때문에 Optional로 결과를 반환해준다.
        OptionalInt min = intStream4.reduce(Integer::min);

        System.out.println("count = " + count);
        System.out.println("sum = " + sum);
        System.out.println("max = " + max.getAsInt());
        System.out.println("min = " + min.getAsInt());

    }
}
