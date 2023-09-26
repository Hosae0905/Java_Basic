package Generics;

import java.util.ArrayList;

/**
 * 제한된 제네릭 클래스
 * extends로 대입할 수 있는 타입을 제한할 수 있다.
 * 인터페이스인 경우에도 extends를 사용한다.
 *
 * 제네릭의 제약
 * 타입 변수에 대입은 인스턴스 별로 다르게 가능하다. - (static 멤버에는 타입 변수를 사용할 수 없음)
 * 배열을 생성할 때 타입 변수를 사용할 수 없다. - (배열을 선언할 때는 가능함)
 *
 */

interface Buyable { }

class Product1 implements Buyable{
    public String toString() { return "Product"; }
}

class Tv1 extends Product1 {
    public String toString() { return "Tv"; }
}

class Laptop extends Product1 {
    public String toString() { return "Laptop"; }
}

class Computer {
    public String toString() { return "Computer"; }
}

class MartCart<T extends Product1 & Buyable> extends Cart<T> { }

class Cart<T> {
    ArrayList<T> list = new ArrayList<>();
    void add(T item) { list.add(item); }
    T get(int i) { return list.get(i); }
    int size() { return list.size(); }
    public String toString() { return list.toString(); }

    T[] arr;        // T타입의 배열을 위한 참조변수를 만들 수 있다.
//    T[] arr1 = new T[5];      // 배열을 생성할 때는 제네릭의 타입 변수를 사용할 수 없다.
}

public class Ex_3 {
    public static void main(String[] args) {
        MartCart<Product1> productCart = new MartCart<>();
        MartCart<Tv1> tvCart = new MartCart<>();
        MartCart<Laptop> laptopCart = new MartCart<>();
//        MartCart<Computer> computerCart = new MartCart<Computer>();       상속받지 않은 클래스는 제레닉 타입으로 사용할 수 없다.

        productCart.add(new Product1());
        productCart.add(new Tv1());
        productCart.add(new Laptop());

        tvCart.add(new Tv1());
//        tvCart.add(new Laptop());     // 자손 타입이 아니기 때문에 매개변수 다형성이 불가능하다.

        laptopCart.add(new Laptop());

        System.out.println("productCart = " + productCart);
        System.out.println("tvCart = " + tvCart);
        System.out.println("laptopCart = " + laptopCart);

    }
}
