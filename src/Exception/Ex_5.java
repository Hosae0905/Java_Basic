package Exception;

/**
 * 연결된 예외
 * 한 예외가 다른 예외를 발생시킬 수 있다.
 * 예외 A가 예외 B를 발생시키면 A는 B의 원인 예외이다.
 * 
 * Throwable initCause(Throwable cause) 지정한 예외를 원인 예외로 등록
 * Throwable getCause() 원인 예외를 반환
 *
 * 연결된 예외를 사용하는 이유
 * 여러 예외를 하나로 묶어서 다루기 위해
 * checked 예외를 unchecked 예외로 변경하려 할 때 사용한다.
 * unchecked 예외로 변경할 때 상속 계층도를 바꿔야 되서 부담이 될 수도 있기 때문에 연결된 예외를 사용하므로 바꾼다.
 *
 */

public class Ex_5 {
    public static void main(String[] args) {

    }
}
