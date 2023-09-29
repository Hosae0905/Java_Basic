package Thread;

import java.util.ArrayList;

/**
 * wait()와 notify()
 * 동기화의 단점으로는 효율이 떨어진다는 점이다. 이러한 문제를 해결하기 위해 wait()와 notify() 메서드를 사용하여 해결한다.
 * Object 클래스에 정의되어 있으며, 동기화 블록 내에서만 사용할 수 있다.
 *
 * wait() - 객체의 lock을 풀고 스레드를 해당 객체의 waiting pool에 넣는다.
 * notify() - waiting pool에서 대기중인 스레드 중의 하나를 깨운다.
 * notifyAll() - waiting pool에서 대기중인 모든 스레드를 깨운다.
 */

class Customer implements Runnable {

    private Table table;
    private String food;

    Customer(Table table, String food) {
        this.table = table;
        this.food = food;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) { }
            String name = Thread.currentThread().getName();

            if (eatFood()) {
                System.out.println(name + " ate a " + food);
            } else {
                System.out.println("name = " + "failed to eat. :(");
            }
        }
    }

    boolean eatFood() { return table.remove(food); }
}

class Cook implements Runnable {
    private Table table;

    @Override
    public void run() {
        while (true) {
            int idx = (int)(Math.random() * table.dishNum());
            table.add(table.dishNames[idx]);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) { }
        }
    }

    Cook(Table table) {
        this.table = table;
    }
}

class Table {
    String[] dishNames = {"pizza", "burger", "coke"};
    final int MAX_FOOD = 6;
    private ArrayList<String> dishes = new ArrayList<>();
    public synchronized void add(String dish) {
        if (dishes.size() >= MAX_FOOD) return;
        dishes.add(dish);
        notify();
        System.out.println("Dishes: " + dishes.toString());
    }

    public boolean remove(String dishName) {
        synchronized (this) {
            String name = Thread.currentThread().getName();
            while (dishes.size() == 0) {
                System.out.println(name + " is waiting");
                try {
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e) { }
            }
            while (true) {
                for (int i = 0; i < dishes.size(); i++) {
                    if (dishName.equals(dishes.get(i))) {
                        dishes.remove(i);
                        notify();
                        return true;
                    }
                }

                try {
                    System.out.println(name + " is waiting.");
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e) { }
            }
        }
    }

    public int dishNum() {
        return dishNames.length;
    }
}

public class Ex_9 {
    public static void main(String[] args) throws Exception{
        Table table = new Table();

        new Thread(new Cook(table), "COOK").start();
        new Thread(new Customer(table, "pizza"), "CUST1").start();
        new Thread(new Customer(table, "Coke"), "CUST2").start();
        Thread.sleep(2000);
        System.exit(0);
    }
}
