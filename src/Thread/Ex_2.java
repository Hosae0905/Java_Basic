package Thread;

/**
 * main스레드
 * main 메서드의 코드를 수행하는 스레드
 * 스레드는 사용자 스레드와 데몬 스레드 두 종류가 있다.
 * 프로그램은 실행 중인 사용자 스레드가 하나도 없을 때 종료된다.
 *
 */

class ThreadTest1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println(new String("-"));
        }
    }
}

class ThreadTest2 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println(new String("|"));
        }
    }
}

public class Ex_2 {
    static long startTime = 0;

    public static void main(String[] args) {
        ThreadTest1 test1 = new ThreadTest1();
        ThreadTest2 test2 = new ThreadTest2();

        test1.start();
        test2.start();
        startTime = System.currentTimeMillis();

        try {
            test1.join();       // main 스레드가 test1의 작업이 끝날 때까지 기다린다.
            test2.join();       // main 스레드가 test2의 작업이 끝날 때까지 기다린다.    --> join()이 없으면 main 스레드 먼저 끝나게 된다.
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("소요시간: " + (System.currentTimeMillis() - startTime));        // try문을 주석처리하면 실행했을 때 main 스레드가 먼저 종료된다.
    }
}
