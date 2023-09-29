package Thread;

import javax.swing.*;

/**
 * 스레드의 I/O 블록킹
 * 입출력시 작업이 중단되는 경우를 말한다.
 */

class ThreadTest3 extends Thread {
    public void run() {
        for (int i = 10; i >0 ; i--) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Ex_3 {
    public static void main(String[] args) {
        ThreadTest3 test = new ThreadTest3();
        test.start();

        // 멀티스레드로 설정하지 않으면 해당 입력값을 받는 코드는 계속 대기하게 된다.
        String input = JOptionPane.showInputDialog("아무 값이나 입력해주세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");
    }
}
