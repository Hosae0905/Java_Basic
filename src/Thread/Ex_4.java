package Thread;

/**
 * 스레드의 우선순위
 * 작업의 중요도에 따라 스레드의 우선순위를 다르게 하여 특정 스레드가 더 많은 작업시간을 갖게 할 수 있다.
 * 우선순위는 일종의 희망사항이라고 생각하자. OS의 스케줄러가 우리가 원하는대로 처리를 안 해줄 수 있다.
 * 스케줄러가 참고만 하지 실제로 그렇게 실행시켜주지 않는다.
 * 우선순위의 높을 수록 작업이 먼저 끝날 확률이 커진다.
 *
 * 스레드 그룹
 * 서로 관련된 스레드를 그룹으로 묶어서 다루기 위한 것
 * 모든 스레드는 반드시 하나의 스레드 그룹에 포함되어 있어야 한다.
 * 스레드 그룹을 지정하지 않고 생성한 스레드는 자동으로 main 스레드 그룹에 속한다.
 * 자신을 생성한 스레드(부모 스레드)의 그룹과 우선순위를 상속받는다.
 */

class PriorityThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
            for (int j = 0; j < 10000000; j++);     // 시간만 지연시키기
        }
    }
}

class PriorityThread2 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
            for (int j = 0; j < 10000000; j++);     // 시간만 지연시키기
        }
    }
}

public class Ex_4 {
    public static void main(String[] args) {
        PriorityThread1 thread1 = new PriorityThread1();
        PriorityThread2 thread2 = new PriorityThread2();

//        thread1.setPriority(5);       // 기본적으로 우선순위는 5로 설정되어 있다.
        thread2.setPriority(7);

        System.out.println("thread1.getPriority() = " + thread1.getPriority());
        System.out.println("thread2.getPriority() = " + thread2.getPriority());
        thread1.start();
        thread2.start();        // 우선순위가 높은 thread2가 마지막에 종료될 수도 있다.
    }
}
