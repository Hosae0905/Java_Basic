package Thread;

/**
 * 프로세스와 스레드
 * 프로세스: 실행 중이 프로그램, 자원과 스레드로 구성
 * 스레드: 프로세스 내에서 실제 작업을 수행
 *        모든 프로세스는 최소한 하나의 스레드를 가지고 있다.
 * 싱글 스레드 프로세스: 자원 + 스레드
 * 멀티 스레드 프로세스: 자원 + 스레드 + 스레드....
 * 하나의 새로운 프로세스를 생성하는 것보다 하나의 새로운 스레드를 생성하는 것이 더 적은 비용이 든다.
 *
 * 멀티 스레드의 장단점
 * 장점 - 시스템 자원을 보다 효율적으로 사용할 수 있다.
 *       사용자에 대한 응답성이 향상된다.
 *       작업이 분리되어 코드가 간결해 진다.
 * 단점 - 동기화에 주의해야 한다.
 *       교착 상태가 발생하지 않도록 주의해야 한다.
 *       각 스레드가 효율적으로 고르게 실행될 수 있게 해야 한다.
 *
 * 스레드의 구현과 실행
 * 1. Thread 클래스를 상속하는 방법
 * 2. Runnable 인터페이스 구현
 * 
 * 스레드의 실행
 * 스레드를 생성한 후에 start()를 호출해야 스레드가 작업을 시작한다.
 * 여러 가지 작업 중 실행하는 순서는 OS 스케줄러가 결정한다.
 * start()를 하면 호출 스택을 하나 더 생성해서 run()를 넣어준다.
 */

public class Ex_1 {
    public static void main(String[] args) {
        ThreadEx th1 = new ThreadEx();

        Thread th2 = new Thread(new ThreadEx1());     // 생성자 Thread(Runnable target)

        th1.start();        // start() 했다고 바로 작업을 시작하는 것은 아님
        th2.start();

        // 스레드가 작업하는 밑의 for문 코드를 main 메서드에서 실행하면 하나의 for문이 끝나야 다음 for문을 실행하지만
        // 스레드로 나눠서 작업할 경우 뒤섞이게 된다.
    }
}

class ThreadEx extends Thread {     // Thread 클래스를 상속받아서 스레드를 구현
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName());
        }
    }
}

class ThreadEx1 implements Runnable {       // Runnable 인터페이스를 구현해서 스레드를 구현
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
