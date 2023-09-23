package Exception;

/**
 * 사용자 정의 예외
 * 직접 예외 클래스를 정의할 수 있음
 * 조상은 Exception과 RuntimeException 중에서 선택
 *
 * 예외 되던지기
 * 예외를 처리한 후에 다시 예외를 발생시키는 것
 * 호출한 메서드와 호출된 메서드 양쪽 모두에서 예외처리하는 것
 * 분담 처리를 할 때 사용한다.
 */

class testException extends Exception {

    private int ERROR_CODE;

    testException(String msg, int errCode) {
        super(msg);
        ERROR_CODE = errCode;
    }

    testException(String msg) {
        super(msg);
    }
}

public class Ex_4 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main 메서드에서 예외가 처리됨");
        }
    }
    
    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1에서 예외가 처리됨");
            throw e;
        }
    }
}
