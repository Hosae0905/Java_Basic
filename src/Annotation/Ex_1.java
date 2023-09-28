package Annotation;


import java.util.ArrayList;
import java.util.Date;

/**
 * 애너테이션
 * 주석처럼 프로그래밍 언어에 영향을 미치지 않으며 유용한 정보를 제공
 * 
 * 표준 애너테이션
 * 자바에서 제공하는 애너테이션이 있다.
 * 
 * @Override
 * 오버라이딩을 올바르게 했는지 컴파일러가 체크하게 한다. --> 메서드 이름을 잘못적는 실수를 예방할 수 있음
 *
 * @Deprecated
 * 앞으로 사용하지 않을 것을 권장하는 필드나 메서드에 붙인다.
 * 예시로 Date 클래스의 getDate()
 * 해당 애너테이션이 붙은 대상이 사용된 코드를 컴파일하면 deprecation 경고를 알려준다.
 *
 * @FunctionalInterface
 * 함수형 인터페이스에 붙이면 컴파일러가 올바르게 작성했는지 체크해준다.
 * 함수형 인터페이스에는 하나의 추상메서드만 가져야 한다는 제약이 있다.
 *
 * @SuppressWarnings
 * 컴파일러의 경고메시지가 나타나지 않게 억제한다.
 * 괄호안에 억제하고자하는 경고의 종류를 문자열로 지정한다.
 * 둘 이상의 경로를 동시에 억제할 수 있다.
 */

class Parent {
    void parentMethod() { }
}

class Child extends Parent {
    
//    void parentmethod() { }     // 조상의 메서드를 오버라이딩하려고 했지만 철자를 잘못적어서 전혀 다른 메서드로 분류되는 경우가 있다.
    @Override
    void parentMethod() { }     // @Overrind를 붙여서 해당 메서드는 오버라이딩하는 메서드라고 표시해줘서 사전에 실수를 예방할 수 있다.

    @Deprecated
    void test() { }
}

@FunctionalInterface
interface Testable {
    void test();
//    void check();     // 함수형 인터페이스이므로 한 개 이상의 메서드를 작성하면 에러가 발생한다.
}

public class Ex_1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.test();

        @SuppressWarnings({"unchecked", "rowtypes"})
        ArrayList list = new ArrayList();
    }
}
