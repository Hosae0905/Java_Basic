package Generics;

import java.util.ArrayList;

/**
 * 지네릭 타입의 형변환
 * 지네릭 타입과 원시 타입 간의 형변환은 바람직 하지 않다. (경고 발생)
 * 와일드 카드가 사용된 지네릭 타입으로는 형변환이 가능하다.
 *
 * 지네릭 타입의 제거
 * 컴파일러는 지네릭 타입을 제거하고 필요한 곳에 형변환을 넣는다.
 * 지네릭 타입의 경계를 제거하고 타입이 불일치하면 형변환을 추가해준다.
 * 와일드 카드가 포함된 경우에 적절한 타입으로 형변환을 추가해준다.
 *
 */

interface Eatable {}

class Fruit implements Eatable {
    public String toString() { return "Fruit"; }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    @Override
    public String toString() {
        return "Grape";
    }
}

class Toy {
    @Override
    public String toString() {
        return "Toy";
    }
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
    ArrayList<T> list = new ArrayList<>();
    void add(T item) { list.add(item); }
    T get(int i) { return list.get(i); }
    int size() { return list.size(); }

    @Override
    public String toString() {
        return list.toString();
    }
}

public class Ex_5 {
    public static void main(String[] args) {
        Box b = null;
        Box<String> bStr = null;

        b = (Box) bStr;             // 원시타입을 지네릭 타입으로 형변환 할 수는 있지만 경고가 발생한다.
        bStr = (Box<String>) b;

        Box<? extends Object> box = new Box<String>();      // 와일드 카드를 사용한 지네릭 타입은 형변환이 가능하다.
//        Box<? extends Object> box = new Box<String>();    // 위의 코드를 실행하면 해당 코드처럼 형변환을 해준다.
    }
}
