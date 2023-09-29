package Thread;

/**
 * 스레드의 동기화
 * 멀티 스레드 프로세스에서는 다른 스레드의 작업에 영향을 미칠 수 있다. --> 같은 메모리를 공유하기 때문에
 * 진행중인 작업이 다른 스레드에게 간섭받지 않게 하려면 동기화가 필요하다.
 * 동기화하려면 간섭받지 않아야 하는 문장들을 임계 영역으로 설정해야 한다.
 * 임계여역은 락을 얻은 단 하나의 스레드만 출입이 가능하다. (객체 1개에 락 1개)
 * 효율적인 스레드 작업을 위해 하나의 스레드에 한 개의 임계영역으로 설정하는 것이 좋다. --> 임계 영역이 많으면 비효율적임
 * 
 * synchronized로 임계영역을 설정하는 방법 2가지
 * 1. 메서드 전체를 임계 영역으로 지정
 * 2. 특정한 영역을 임계 영역으로 지정
 */

class Account {
    private int balance = 1000;     // 제어자를 private으로 설정해야 한다. public으로 설정하면 외부에서 직접 접근이 가능하기 때문에 동기화 의미가 없음

    public synchronized int getBalance() {
        return balance;
    }

//    public void withDraw(int money) {
    public synchronized void withDraw(int money) {
        if (balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { }
            balance -= money;
        }
    }
}

class RunnableAccount implements Runnable {
    Account acc = new Account();

    @Override
    public void run() {
        while (acc.getBalance() > 0) {
            int money = (int)(Math.random() * 3 + 1) * 100;
            acc.withDraw(money);
            System.out.println("balance = " + acc.getBalance());
        }
    }
}

public class Ex_8 {
    public static void main(String[] args) {
        RunnableAccount r = new RunnableAccount();
        new Thread(r).start();
        new Thread(r).start();
    }
}
