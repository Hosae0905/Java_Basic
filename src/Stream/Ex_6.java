package Stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

/**
 * 스트림의 최종 연산 - collect와 Collectors
 * collect()는 Collector를 매개변수로 하는 스트림의 최종 연산
 * 그룹별 reducing이 가능하다.
 * Collector는 수집에 필요한 메서드를 정의해 놓은 인터페이스
 * Collectors 클래스는 다양한 기능의 Collector를 제공한다.
 *
 * 스트림을 컬렉션, 배열로 변환할 수 있다.
 * 
 * 스트림의 통계
 * counting(), summingInt() --> 스트림의 통계 정보를 제공한다.
 * 
 * reducing() - 스트림을 리듀싱
 * joining() - 문자열 스트림의 요소를 모두 연결
 *
 * 스트림의 그룹화와 분할
 * partitioningBy()로 스트림을 2분할한다.
 * groupingBy()는 스트림을 n분할한다.
 *
 *
 */

class Student1 {
    String name;
    boolean isMale;
    int grade;
    int schoolNum;
    int score;

    public Student1(String name, boolean isMale, int grade, int schoolNum, int score) {
        this.name = name;
        this.isMale = isMale;
        this.grade = grade;
        this.schoolNum = schoolNum;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return isMale;
    }

    public int getGrade() {
        return grade;
    }

    public int getSchoolNum() {
        return schoolNum;
    }

    public int getScore() {
        return score;
    }

    public String toString() {
        return String.format(
                "[%s, %s, %d학년 %d반, %3d점]",
                name, isMale ? "남" : "여", grade, schoolNum, score
        );
    }

    enum Level { HIGH, MID, LOW }
}

public class Ex_6 {
    public static void main(String[] args) {
        Student1[] stuArr = {
                new Student1("Kim", true, 1, 1, 240),
                new Student1("Choi", false, 1, 1, 278),
                new Student1("Choi", false, 1, 1, 119),
                new Student1("Yang", true, 1, 2, 98),
                new Student1("Jane", false, 1, 2, 222),
                new Student1("Choi", false, 1, 2, 300),
                new Student1("Tom", true, 2, 1, 167),
                new Student1("Kang", false, 2, 1, 264),
                new Student1("Choi", false, 2, 1, 99),
                new Student1("Sung", true, 2, 2, 80),
                new Student1("Brown", true, 2, 2, 300),
                new Student1("Choi", false, 2, 2, 160),
        };

        System.out.printf("1. 단순분할(성별로 분할)%n");
        Map<Boolean, List<Student1>> stuBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student1::isMale));

        List<Student1> maleStudent = stuBySex.get(true);
        List<Student1> femaleStudent = stuBySex.get(false);

        for(Student1 s : maleStudent) System.out.println(s);
        for(Student1 s : femaleStudent) System.out.println(s);

        System.out.printf("%n2. 단순분할 + 통계(성별 학생수)%n");
        Map<Boolean, Long> stuMunBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student1::isMale, counting()));

        System.out.println("남학생 수 = " + stuMunBySex.get(true));
        System.out.println("여학생 수 = " + stuMunBySex.get(false));

        System.out.printf("%n3. 단순분할 + 통계(성별 1등)%n");
        Map<Boolean, Optional<Student1>> topScoreBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student1::isMale,
                        maxBy(comparingInt(Student1::getScore))));

        System.out.println("남학생 1등 = " + topScoreBySex.get(true));
        System.out.println("여학생 1등 = " + topScoreBySex.get(false));

        Map<Boolean, Student1> topScoreBySex2 = Stream.of(stuArr)
                .collect(partitioningBy(Student1::isMale,
                        collectingAndThen(
                                maxBy(comparingInt(Student1::getScore)), Optional::get
                        )));
        System.out.println("남학생 1등 = " + topScoreBySex2.get(true));
        System.out.println("여학생 1등 = " + topScoreBySex2.get(false));

        System.out.printf("%n4. 다중분할(성별 불합격자, 100점 이하)%n");

        Map<Boolean, Map<Boolean, List<Student1>>> failedStuBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student1::isMale,
                        partitioningBy(s -> s.getScore() <= 100)));

        List<Student1> failedMaleStu = failedStuBySex.get(true).get(true);
        List<Student1> failedFeMaleStu = failedStuBySex.get(false).get(true);

        for (Student1 s : failedMaleStu) System.out.println(s);
        for (Student1 s : failedFeMaleStu) System.out.println(s);


    }
}
