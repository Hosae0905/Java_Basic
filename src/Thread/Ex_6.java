package Thread;

import javax.swing.*;

/**
 * 스레드의 실행제어
 * 스레드의 실행을 제어할 수 있는 메서드가 제공된다.
 * 메서드를 활용해서 보다 효율적인 프로그램을 작성할 수 있다.
 * sleep - 지정된 시간동안 스레드를 일시정지시킨다. 지정한 시간이 지나고 나면 자동적으로 다시 실행대기상태가 된다.
 * join - 지정된 시간동안 스레드가 실행되도록 한다. 지정된 시간이 지나거나 작업이 종료되면 join을 호출한 스레드로 다시 돌아와 실행을 계속한다.
 * interrupt - sleep이나 join에 의해 일시정지상태인 스레드를 깨워서 실행대기상태로 만든다.
 * stop - 스레드를 즉시 종료시킨다.
 * suspend - 스레드를 일시정지시키고 resume을 호출하면 다시 실행대기상태가 된다.
 * resume - 일시정지상태에 있는 스레드를 실행대기상태로 만든다.
 * yield - 실행 중에 자신에게 주어진 실행시간을 다른 스레드에게 양보하고 자신은 실행대기상태가 된다.
 *
 * sleep과 yield는 static 메서드이기 때문에 자기 자신한테만 동작한다.
 * sleep은 예외처리를 해줘야 한다. (예외가 발생하면 깨어나기 때문)
 */

class SleepTest1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
        }
        System.out.println("<thread1 종료>");
    }
}

class SleepTest2 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
        }
        System.out.println("<thread2 종료>");
    }
}

class InterruptedTest extends Thread {
    public void run() {
        int i = 10;
        while (i != 0 && !isInterrupted()) {
            System.out.println(i--);
            for (long x = 0; x < 250000000L; x++);
        }
        System.out.println("카운트가 종료되었습니다.");
    }
}

public class Ex_6 {
    public static void main(String[] args) {
        SleepTest1 thread1 = new SleepTest1();
        SleepTest2 thread2 = new SleepTest2();
        thread1.start();
        thread2.start();

        delay(2 * 1000);

        InterruptedTest thread3 = new InterruptedTest();
        thread3.start();

        System.out.println("thread3.isInterrupted() = " + thread3.isInterrupted());
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("input = " + input);
        thread3.interrupt();
        System.out.println("thread3.isInterrupted() = " + thread3.isInterrupted());
//        System.out.println("thread3.interrupted() = " + thread3.interrupted());   // interrupted는 static 메서드로 현재 스레드를 호출하기 때문에 지금은 main 스레드를 호출하게 된다.

        System.out.println("<main 종료>");
    }

    static void delay(long millis) {
        try {
            Thread.sleep(2000);        //
        } catch (InterruptedException e) { }
    }
}
