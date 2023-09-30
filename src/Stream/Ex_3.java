package Stream;

import java.io.File;
import java.util.stream.Stream;

/**
 * 스트림의 연산 - 중간연산
 * map() - 스트림의 요소 변환하기
 * peek() - 스트림의 요소를 소비하지 않고 엿보기
 *        중간 작업 결과를 확인할 때 사용한다.
 * flatMap() - 스트림의 스트림을 스트림으로 변환할 때 사용한다.
 */

public class Ex_3 {
    public static void main(String[] args) {
        File[] fileArr = {
                new File("Ex1.java"),
                new File("Ex1.bsb"),
                new File("Ex2.py"),
                new File("Ex2.c"),
                new File("Ex3")
        };

        Stream<File> fileStream = Stream.of(fileArr);

        Stream<String> fileNames = fileStream.map(File::getName);
        fileNames.forEach(System.out::println);

        fileStream = Stream.of(fileArr);

        fileStream.map(File::getName)
                .filter(s -> s.indexOf('.') != -1)
                .peek(s -> System.out.printf("filename = %s%n", s))
                .map(s -> s.substring(s.indexOf('.') + 1))
                .peek(s -> System.out.printf("extension = %s%n", s))
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::println);

        System.out.println();
    }
}
