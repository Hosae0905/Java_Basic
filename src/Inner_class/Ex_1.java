package Inner_class;

/**
 * 내부 클래스
 * 클래스 안의 클래스
 *
 * 내부 클래스의 장점
 * 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있다.
 * 코드의 복잡성을 줄일 수 있다. (캡슐화)
 *
 * 내부 클래스의 종류와 특징
 * - 인스턴스 클래스: 외부 클래스의 멤버변수 선언위치에 선언하며, 외부 클래스의 인스턴스 멤버처럼 다뤄진다.
 * 주로 외부 클래스의 인스턴스 멤버들과 관련된 작업에 사용될 목적으로 선언된다.
 * - 스태택 클래스: 외부 클래스의 멤버변수 선언위치에 선언하며, 외부 클래스의 static 멤버처럼 다뤄진다.
 * 주로 외부 클래스의 static 멤버, 특히 static 메서드에서 사용될 목적으로 선언된다.
 * - 지역 클래스: 외부 클래스의 메서드나 초기화블럭 안에 선언하며, 선언된 영역 내부에서만 사용될 수 있다.
 * - 익명 클래스: 클래스의 선언과 객체의 생성을 동시에 하는 이름없는 클래스(일회용)
 */

class outerClass {

    final int NUMBER = 5;
    final String CLASS = "외부 클래스";

    void innerClassPrint() {
        innerClass inc = new innerClass();
        inc.classPrint();
    }

    class innerClass {  // 인스턴스 클래스
        int num = 10;
        String innclass = "내부 클래스";

        void classPrint() {
            System.out.println(innclass);
        }
    }

    static class staticInner {}     // static 클래스

    void Method() {     // 지역 클래스
        class localInner {}
    }
}

public class Ex_1 {

    public static void main(String[] args) {

        outerClass test = new outerClass();

        System.out.println(test.CLASS);
        System.out.println(test.NUMBER);
        test.innerClassPrint();

    }
}
