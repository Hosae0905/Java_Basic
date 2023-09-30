package Lamda;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 메서드 참조
 * 하나의 메서드만 호출하는 람다식은 메서드 참조로 간단히 할 수 있다.
 * static 메서드 참조 --> (x) -> ClassName.method(x) --> ClassName::method
 * 인스턴스 메서드 참조 --> (obj, x) -> obj.method(x) --> ClassName::method
 *
 * 생성자의 메서드 참조
 * Supplier<클래스이름> 변수 이름 = 클래스이름::메서드이름;  --> Supplier말고 다른 것도 다 가능함.
 */

public class Ex_6 {
    public static void main(String[] args) {
//        Function<String, Integer> function = (String s) -> Integer.parseInt(s);
        Function<String, Integer> function = Integer::parseInt;     // 메서드 참조로 간단하게 표현할 수 있다.
        System.out.println(function.apply("100") + 100);

//        Supplier<MyClass> s = () -> new MyClass();
//        Supplier<MyClass> s = MyClass::new;     // 생성자는 메서드 참조로 간단하게 표현할 수 있다.
//        System.out.println(s.get());

//        Function<Integer, MyClass> f = (x) -> new MyClass(x);
        Function<Integer, MyClass> f = MyClass::new;
        System.out.println(f.apply(100).value);

        Function<Integer, int[]> array = int[]::new;
        System.out.println(array.apply(30).length);


    }
}

class MyClass {
    int value;

    MyClass(int value) {
        this.value = value;
    }
}
