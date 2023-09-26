package Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 제네릭 클래스의 다형성
 * 대입되는 타입은 상속관계여도 일치하지 않으면 에러가 발생한다.
 * 단, 제네릭 클래스간의 다형성을 성립한다.(대입되는 타입은 일치해야 함)
 * 매개변수의 다형성도 성립된다.
 *
 * 제네릭 타입 변수는 여러 개 사용할 수 있다. (콤마를 구분자로 선언)
 */

class Product {}
class Tv extends Product {}
class Audio extends Product {}

public class Ex_2 {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<Product>();     // 타입 변수가 일치함
//        ArrayList<Product> list1 = new ArrayList<Tv>();         // 상속 관계여도 타입은 일치해야 한다.
        List<Product> list2 = new ArrayList<Product>();         // 같은 제네릭 클래스는 다형성이 가능하다.

        ArrayList<Tv> tvList = new ArrayList<Tv>();

        list.add(new Tv());
        list.add(new Audio());      // 매개변수의 다형성은 가능하다. 해당 메서드의 타입 변수가 Product로 바뀌기 때문

        printAll(list);
//        printAll(tvList);       // tvList는 제네릭 타입이 Tv이기 때문에 매개변수 다형성이 안된다.

        HashMap<Integer, String> map = new HashMap<Integer, String>();      // 타입 변수를 두 개 쓸 수 있다. (콤마를 사용해서 구분)

    }

    private static void printAll(ArrayList<Product> list) {
        for (Product p : list) {
            System.out.println("p = " + p);
        }
    }
}
