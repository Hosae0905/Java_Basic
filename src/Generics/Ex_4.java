package Generics;

import java.util.ArrayList;

/**
 * 와일드 카드 < ? >
 * 하나의 참조 변수로 대입된 타입이 다른 객체를 참조 가능
 * 메서드의 매개변수에 와일드 카드를 사용할 수 있다.
 *
 *
 * <? extends T> - 와일드 카드의 상한 제한. T와 그 자손들만 가능
 * <? super T> - 와일드 카드의 하한 제한. T와 그 조상들만 가능
 * <?> - 모든 타입이 가능하다. 제한이 없음(<? extends Object>)와 동일
 */

interface Buyable1 { }

class Product2 implements Buyable1{
    public String toString() { return "Product"; }
}

class Tv2 extends Product2 {
    public String toString() { return "Tv"; }
}

class Laptop2 extends Product2 {
    public String toString() { return "Laptop"; }
}

class Computer2 {
    public String toString() { return "Computer"; }
}

class MartCart2<T extends Product2 & Buyable1> extends Cart2<T> { }

class Cart2<T> {
    ArrayList<T> list = new ArrayList<>();
    void add(T item) { list.add(item); }
    T get(int i) { return list.get(i); }
    ArrayList<T> getList() { return list; }
    int size() { return list.size(); }
    public String toString() { return list.toString(); }
}

class Total {
    static ShowProduct totalProduct(MartCart2<? extends Product2> product) {
        String temp = "";

        for (Product2 p : product.getList()) {
            temp += p + " ";
        }
        return new ShowProduct(temp);
    }
}

class ShowProduct {

    String product;
    ShowProduct(String product) {
        this.product = product;
    }
    public String toString() { return product; }
}

public class Ex_4 {
    public static void main(String[] args) {
        MartCart2<Product2> product = new MartCart2<Product2>();        // 타입이 같기 때문에 가능함
//        MartCart2<Tv2> laptop = new MartCart2<Laptop2>();               // 타입이 일치하지 않기 때문에 불가능
        MartCart2<? extends Product2> tv = new MartCart2<Product2>();        // 와일드 카드를 사용하면 타입이 달라도 사용할 수 있다. (Product2의 자손만 가능)
//        tv = new MartCart2<Laptop2>();      // 자손을 타입으로 받을 수 있게 된다.

        product.add(new Laptop2());
        product.add(new Tv2());

        System.out.println(Total.totalProduct(product));
    }
}
