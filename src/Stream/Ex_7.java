package Stream;

import java.util.*;
import java.util.stream.Stream;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

/**
 * groupingBy()
 *
 *
 */

class Student2 {
    String name;
    boolean isMale;
    int grade;
    int schoolNum;
    int score;

    public Student2(String name, boolean isMale, int grade, int schoolNum, int score) {
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

public class Ex_7 {
    public static void main(String[] args) {
        Student2[] stuArr = {
                new Student2("Kim", true, 1, 1, 240),
                new Student2("Choi", false, 1, 1, 278),
                new Student2("Choi", false, 1, 1, 119),
                new Student2("Yang", true, 1, 2, 98),
                new Student2("Jane", false, 1, 2, 222),
                new Student2("Choi", false, 1, 2, 300),
                new Student2("Tom", true, 2, 1, 167),
                new Student2("Kang", false, 2, 1, 264),
                new Student2("Choi", false, 2, 1, 99),
                new Student2("Sung", true, 2, 2, 80),
                new Student2("Brown", true, 2, 2, 300),
                new Student2("Choi", false, 2, 2, 160),
        };

        System.out.printf("1. 단순 그룹화(반별로 분할)%n");
        Map<Integer, List<Student2>> stuBySchoolNum = Stream.of(stuArr)
                .collect(groupingBy(Student2::getSchoolNum));

        for (List<Student2> sNum : stuBySchoolNum.values()) {
            for (Student2 s : sNum) {
                System.out.println(s);
            }
        }

        System.out.printf("%n2. 단순 그룹화(성적별로 그룹화)%n");
        Map<Student2.Level, List<Student2>> stuByLevel = Stream.of(stuArr)
                .collect(groupingBy(s -> {
                    if (s.getScore() >= 200) return Student2.Level.HIGH;
                    else if (s.getScore() >= 100) return Student2.Level.MID;
                    else return Student2.Level.LOW;
                }));

        TreeSet<Student2.Level> keySet = new TreeSet<>(stuByLevel.keySet());

        for (Student2.Level key : keySet) {
            System.out.println("[" + key + "]");
            for (Student2 s : stuByLevel.get(key))
                System.out.println(s);
            System.out.println();
        }

        System.out.printf("%n3. 단순 그룹화 + 통계(성적별 학생수)%n");
        Map<Student2.Level, Long> stuCntByLevel = Stream.of(stuArr)
                .collect(groupingBy(s -> {
                    if (s.getScore() >= 200) return Student2.Level.HIGH;
                    else if (s.getScore() >= 100) return Student2.Level.MID;
                    else return Student2.Level.LOW;
                }, counting()));

        for (Student2.Level key : stuCntByLevel.keySet())
            System.out.printf("[%s] - %d명, ", key, stuCntByLevel.get(key));
        System.out.println();

        System.out.printf("%n4. 다중그룹화(학년별, 반별)%n");

        Map<Integer, Map<Integer, List<Student2>>> StuByGradeAndsNum =
                Stream.of(stuArr)
                .collect(groupingBy(Student2::getGrade,
                        groupingBy(Student2::getSchoolNum)));

        for (Map<Integer, List<Student2>> grade : StuByGradeAndsNum.values()) {
            for (List<Student2> sNum : grade.values()) {
                System.out.println();
                for (Student2 s : sNum)
                    System.out.println(s);
            }
        }

        System.out.printf("%n5. 다중그룹화 + 통계(학년별, 반별 1등)%n");

        Map<Integer, Map<Integer, Student2>> topStuByGradeAndsNum =
                Stream.of(stuArr)
                        .collect(groupingBy(Student2::getGrade,
                                groupingBy(Student2::getSchoolNum,
                                        collectingAndThen(
                                                maxBy(comparingInt(Student2::getScore)),
                                                Optional::get
                                        ))));

        for (Map<Integer, Student2> grade1 : topStuByGradeAndsNum.values()) {
            for (Student2 s : grade1.values()) {
                System.out.println(s);
            }
        }


        System.out.printf("%n6. 다중그룹화 + 통계(학년별, 반별 성적그룹)%n");

        Map<String, Set<Student2.Level>> stuByScoreGroup =
                Stream.of(stuArr)
                        .collect(groupingBy(s -> s.getGrade() + "-" + s.getSchoolNum(),
                                mapping(s-> {
                                    if (s.getScore() >= 200) return Student2.Level.HIGH;
                                    else if (s.getScore() >= 100) return Student2.Level.MID;
                                    else return Student2.Level.LOW;
                                }, toSet())
                        ));

        Set<String> keySet2 = stuByScoreGroup.keySet();

        for (String key : keySet2) {
            System.out.println("[" + key + "]" + stuByScoreGroup.get(key));
        }
    }
}
