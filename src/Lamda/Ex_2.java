package Lamda;

/**
 * 함수형 인터페이스
 * 단 하나의 추상 메서드만 선언된 인터페이스
 * 함수형 인터페이스 타입의 참조변수로 람다식을 참조할 수 있다. (함수형 인터페이스의 메서드와 람다식의 매개변수 개수와 반환 타입이 일치해야 함)
 */

@FunctionalInterface        // 함수형 인터페이스 확인
interface MyFunction {
    int max(int a, int b);
}

public class Ex_2 {
    public static void main(String[] args) {
        MyFunction f = (a, b) -> a > b ? a : b;     // 사용하려면 추상 메서드와 매개변수 개수 및 반환 타입이 일치해야 한다.
        System.out.println("f.max(3, 5) = " + f.max(3, 5));

        test1(f);
        System.out.println(test2().max(4, 9));

    }

    static void test1(MyFunction f) {       // 매개변수로 람다식을 받을 수 있다.
        System.out.println("f.max(2, 6) = " + f.max(2, 6));
    }

    static MyFunction test2() {     // 반환타입으로 람다식 설정이 가능하다.
        MyFunction f = (a, b) -> a > b ? a : b;
        return f;
    }
}
