package Thread;

/**
 * 스레드의 메서드 suspend(), resume(), stop()
 * 해당 메서드들은 교착 상태 때문에 deprecated가 되어 있는 상태이다. --> 되도록 사용하지 말자
 *
 * join()  --> Ex_2 참고
 * 지정된 시간동안 특정 스레드가 작업하는 것을 기다린다. --> 얼마나 기다릴지 지정해준다.
 * 예외처리를 해줘야 한다.
 *
 * yield()
 * 남은 시간을 다음 스레드에게 양보하고 자신은 실행대기를 한다.
 * interrupt()와 같이 적절하게 사용하면 응답성과 효율을 높일 수 있다.
 *
 */

class ThreadMethod implements Runnable {

    boolean stopped = false;        // 실행할 때 프로세스가 멈추지 않으면 volatile 타입을 넣어줘서 수정하면 된다. (원본 데이터에 직접 접근)
    boolean suspended = false;

    Thread thread;

    ThreadMethod(String name) {
        thread = new Thread(this, name);
    }

    void start() {
        thread.start();
    }

    void stop() {
        stopped = true;
    }

    void suspend() {
        suspended = true;
    }

    void resume() {
        suspended = false;
    }


    @Override
    public void run() {
        while (!stopped) {
            if (!suspended) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) { }
            } else {
                Thread.yield();     // 현재 스레드에 시간이 남으면 다른 스레드로 양보한다.
            }
        }
    }
}


public class Ex_7 {
    public static void main(String[] args) {
        ThreadMethod th1 = new ThreadMethod("*");
        ThreadMethod th2 = new ThreadMethod("**");
        ThreadMethod th3 = new ThreadMethod("***");
        th1.start();
        th2.start();
        th3.start();

        try {
            Thread.sleep(2000);
            th1.suspend();
            Thread.sleep(2000);
            th2.suspend();
            Thread.sleep(3000);
            th1.resume();
            Thread.sleep(3000);
            th1.stop();
            th2.stop();
            Thread.sleep(2000);
            th3.stop();
        } catch (InterruptedException e) { }
    }
}
