package Inner_class;

/**
 * 내부 클래스의 접근성
 *
 * 외부 클래스의 지역 변수를 사용할 때 상수만 접근이 가능한 이유는 메서드가 실행이 종료되었지만 다른 실행중인 메서드가 해당 지역변수를
 * 접근할 수 있기 때문에 문제가 발생할 수 있어 상수만 접근이 가능하다.
 * 상수는 따로 constant pool에서 관리를 하기 때문에 메서드가 종료되어도 상수의 값에 접근할 수 있다.
 */

class Outer {
    private int outerIv = 5;
    private static int outerCv = 10;

    class InstanceInner {
        int instanceIv = outerIv;       // private 변수에도 접근이 가능하다. Outer라는 외부 클래스에 존재해서 가능함
        int instanceIv2 = outerCv;      // static이 붙어도 가능
    }

    static class StaticClass {
//        int staticIv = outerIv;           // static 클래스는 외부 인스턴스 변수에 접근할 수 없음. 객체 생성이 없기 때문에
        int staticIv = 3;
        static int staticCv = outerCv;
    }

    void Method() {
        int lv = 0;
        final int lv2 = 0;

//        lv = 3;       // 유사 상수도 가능하지만 해당 코드처럼 값의 변경이 일어날 경우 에러가 발생한다.

        class LocalInner {      // 지역 내부 클래스를 감싸고 있는 메서드의 상수만 가능
            int localIv = outerIv;
            int localCv = outerCv;
            int localLv = lv;           // 외부 클래스의 지역 변수는 final이 붙은 상수만 접근이 가능하다. (유사 상수도 가능함)
            int localLv2 = lv2;
        }
    }
}


public class Ex_3 {
    public static void main(String[] args) {        // 객체를 생성할 때는 외부 클래스를 명시해줘야 한다.
        Outer oc = new Outer();
        Outer.InstanceInner instanceInner = oc.new InstanceInner();     // 인스턴스 내부 클래스 객체 생성
        Outer.StaticClass staticClass = new Outer.StaticClass();        // 스태틱 내부 클래스 객체 생성

        System.out.println(instanceInner.instanceIv);
        System.out.println(staticClass.staticIv);
        System.out.println(Outer.StaticClass.staticCv);         // cv를 출력할때는 따로 객체 생성없이 가능하다.
    }
}
