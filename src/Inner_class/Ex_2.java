package Inner_class;

/**
 * 내부 클래스의 제어자와 접근성
 * 내부 클래스의 제어자는 변수에 사용 가능한 제어자와 동일하다.
 * 외부 클래스는 default와 public 두개만 사용할 수 있지만 내부 클래스는 제어자를 다 사용할 수 있다.
 */

public class Ex_2 {

    class InstanceInner {
        int iv = 100;
        static int cv = 200;
        final static int CONST = 500;
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 300;
    }

    void Method() {
        class LocalInner {
            int iv = 300;
            static int cv = 400;
            final static int CONST = 600;
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(InstanceInner.cv);
        System.out.println(StaticInner.cv);
//        System.out.println(LocalInner.CONST);         // 로컬 내부 클래스는 메서드 내에서만 사용 가능하다.
    }
}
