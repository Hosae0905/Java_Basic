package Exception;

/**
 * 예외 발생시키기
 * 1. 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든다.
 * 2. 키워드 throw를 이용해서 예외를 발생시킨다.
 *
 * checked 예외, unchecked 예외
 * checked 예외 - 컴파일러가 예외 처리 여부를 체크(예외 처리 필수) --> Exception과 자손들
 * unchecked 예외 - 컴파일러가 예외 처리 여부를 체크 안 함(예외 처리 선택) --> RuntimeException과 자손들
 * checked 예외면 try-catch문을 사용하여 예외 처리를 필수적으로 해야한다.
 * 프로그래머가 조심해서 코딩해야 되는 부분을 선택적으로 예외 처리를 할 수 있게 만든다.
 */

public class Ex_2 {
    public static void main(String[] args) {
        
//        throw new RuntimeException();     // unchecked 예외이기 때문에 try-catch문 없이 실행 가능
//        throw new Exception();            // checked 예외이기 때문에 try-catch문 사용해서 필수적으로 예외 처리

        try {
            int a = 0;
            int b = 0;
            if (a / b != 0) {
                throw new ArithmeticException("예외 발생");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
