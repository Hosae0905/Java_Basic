package Thread;

/**
 * 데몬 스레드
 * 일반 스레드의 작업을 돕는 보조적인 역할을 수행한다.
 * 일반 스레드가 모두 종료되면 자동적으로 종료된다. --> 무한루프여도 자동 종료됨
 * 가비지 컬렉터, 자동저장, 화면 자동갱신 등에 사용된다.
 * 무한루프와 조건문을 이용해서 실행 후 대기하다가 특정조건이 만족되면 작업을 수행하고 다시 대기하도록 작성한다.
 * setDaemon(boolean on)은 반드시 start()를 호출하기 전에 실행되어야 한다. --> start 후에는 스레드를 바꿀 수 없음
 * 그렇지 않으면 예외가 발생함
 *
 * 스레드의 상태
 * NEW - 스레드가 생성되고 아직 start가 호출되지 않은 상태
 * RUNNABLE - 실행 중 또는 실행 가능한 상태
 * BLOCKED - 동기화블럭에 의해서 일시정지된 상태
 * WAITING, TIME_WAITING - 스레드의 작업이 종료되지 않았지만 실행가능하지 않은 일시정지 상태, TIME_WAITING은 일시정지시간이 지정된 경우를 의미
 * TERMINATED - 스레드의 작업이 종료된 상태
 *
 *
 */

public class Ex_5 implements Runnable {

    static boolean autoSave = false;

    @Override
    public void run() {     // 데몬 스레드
        while (true) {      // 무한루프
            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

            if (autoSave) autoSave();
        }
    }

    private void autoSave() {
        System.out.println("작업파일이 자동저장되었습니다.");
    }

    public static void main(String[] args) {        // 메인 스레드
        Thread thread = new Thread(new Ex_5());
        thread.setDaemon(true);     // start전에 데몬 스레드로 만들어준다.
        thread.start();

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(i);
            if (i == 5) autoSave = true;
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
