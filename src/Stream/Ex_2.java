package Stream;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * 스트림의 연산 - 중간 연산
 * 스트림은 중간 연산과 최종 연산 기능을 제공한다.
 * 중간 연산의 핵심은 map과 flatMap이다.
 *
 * 스트림 자르기
 * skip - 앞에서부터 n개 건너뛰기
 * limit - maxSize 이후의 요소는 잘라냄
 * 
 * 스트림의 요소 걸러내기
 * filter - 조건에 맞지 않는 요소 제거
 * distinct - 중복을 제거
 *
 * 스트림 정렬
 * sorted - 스트림 요소의 기본 정렬(Comparable)로 정렬
 *          지정된 Comparator로 정렬
 *
 *
 */

class Student implements Comparable<Student> {

    String name;
    int classNum;
    int totalScore;

    Student(String name, int classNum, int totalScore) {
        this.name = name;
        this.classNum = classNum;
        this.totalScore = totalScore;
    }

    public String toString() {
        return String.format("[%s, %d, %d]", name, classNum, totalScore);
    }

    @Override
    public int compareTo(Student s) {
        return s.totalScore - totalScore;
    }

    String getName() { return name; }
    int getClassNum() { return classNum; }
    int getTotalScore() { return totalScore; }
}

public class Ex_2 {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("Kim", 1, 240),
                new Student("Kang", 3, 200),
                new Student("Choi", 2, 160),
                new Student("Yang", 1, 110),
                new Student("Jane", 3, 300),
                new Student("James", 2, 290)
        );

        studentStream.sorted(Comparator.comparing(Student::getClassNum)     // 지정된 Comparator로 정렬
                .thenComparing(Comparator.naturalOrder()))      // naturalOrder() --> 기본 정렬
                .forEach(System.out::println);
    }
}
