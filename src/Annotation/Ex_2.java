package Annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 메타 애너테이션
 * 애너테이션을 만들 때 사용한다.
 *
 * @Target
 * 애너테이션을 정의할 때, 적용 대상을 지정할 때 사용한다.
 *
 * @Retention
 * 애너테이션이 유지되는 기간을 지정하는데 사용한다.
 * 컴파일러에 의해 사용되는 애너테이션의 유지 정책은 SOURCE이다.
 * 실행시에 사용 가능한 애너테이션의 정책은 RUNTIME이다.
 *
 * @Documented, @Inherited
 * javadoc으로 작성한 문서에 포함시키려면 @Document를 붙인다.
 * 애너테이션을 자손 클래스에 상속하고자 할 때 @Inherited를 붙인다.
 *
 * @Repeatable
 * 반복해서 붙일 수 있는 애너테이션을 정의할 때 사용한다.
 * 하나로 묶을 컨테이너 애너테이션도 정의해야 한다.
 *
 * 애너테이션 직접 만들기
 * 애너테이션의 메서드는 추상 메서드이며 애너테이션을 적용할 때 지정(순서 X)
 * 애너테이션을 사용하는 곳에서는 요소들의 값을 지정해야 한다.
 * 요소에 적용시 값을 지정하지 않으면 사용될 수 있는 기본값을 지정할 수 있다.(null은 제외)
 * 요소가 하나이고 이름이 value일 때는 요소의 이름을 생략할 수 있다.
 * 요소의 타입이 배열인 경우 괄호를 사용해야 한다. (값이 없을 때는 괄호가 반드시 필요함. 단 값이 하나면 괄호 생략 가능)
 * Annotation은 모든 애너테이션의 조상이지만 상속은 불가능하다. (Annotation은 사실 인터페이스이기 때문에)
 *
 * 마커 애너테이션
 * 요소가 하나도 정의되지 않은 애너테이션을 뜻한다.
 *
 * 애너테이션 요소의 규칙
 * 요소의 타입은 기본형, String, enum, 애너테이션, Class만 허용된다.
 * 괄호안에 매개변수를 선언할 수 없다.
 * 예외를 선언할 수 없다.
 * 요소를 타입 매개변수로 정의할 수 없다.
 */

@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo {
    int count() default 1;
    String testedBy();
    String[] testTools() default "JUnit";
    TestType testType()  default TestType.FIRST;
    DateTime testDate();

}

@interface DateTime {
    String yymmdd();
    String hhmmss();
}

enum TestType {
    FIRST(1);

    private final int type;


    TestType(int i) {
        this.type = i;
    }
}

@SuppressWarnings("1111")
@TestInfo(testedBy = "aaa", testDate = @DateTime(yymmdd="20230909", hhmmss="123456"))
public class Ex_2 {
    public static void main(String[] args) {
        Class<Ex_2> cls = Ex_2.class;

        TestInfo anno = cls.getAnnotation(TestInfo.class);
        System.out.println("anno.testedBy() = " + anno.testedBy());
        System.out.println("anno.testDate().yymmdd = " + anno.testDate());
        System.out.println("anno.testDate().hhmmss = " + anno.testDate());

        for (String str : anno.testTools()) System.out.println("testTools = " + str);
        System.out.println();

        Annotation[] anArr = cls.getAnnotations();      // 적용된 모든 애너테이션을 가져온다.

        for (Annotation a : anArr) System.out.println("a = " + a);
    }
}
