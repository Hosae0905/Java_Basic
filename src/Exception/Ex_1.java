package Exception;

/**
 * 예외처리
 * 
 * 프로그램 오류의 종류
 * 1. 컴파일 에러 - 컴파일 할 때 발생하는 에러(프로그램 실행 X)
 * 2. 런타임 에러 - 실행 할 때 발생하는 에러(프로그램 실행 --> 종료)
 * 3. 논리적 에러 - 작성 의도와 다르게 동작(프로그램 종료 X)
 * 
 * 자바의 런타임 에러
 * 에러 - 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
 * 예외 - 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류
 * 
 * 예외처리의 정의와 목적
 * 정의 - 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
 * 예외 - 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것
 *
 * try-catch문에서의 흐름
 * 1. try 블럭 내에서 예외가 발생한 경우
 * 1-1. 발생한 예외와 일치하는 catch블럭이 있는지 확인
 * 1-2. 일치하는 catch블럭을 찾게 되면, 그 catch 블럭 내의 문장들을 수행하고 전체 try-catch문을 빠져나가서 그 다음 문자을 계속 수행
 *      일치하는 catch블럭이 없으면 예외는 처리되지 않음
 *      
 * 2. try 블럭 내에서 예외가 발생하지 않은 경우
 * 2-1. catch 블럭을 거치지 않고 전체 try-catch문을 빠져나가서 수행을 계속 진행
 *
 * 예외가 발생하면 예외 객체가 생성된다.
 */

public class Ex_1 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        } catch (ArithmeticException e) {       // 예외 객체를 catch로 잡을 수 있다.
            e.printStackTrace();        // 호출스택에 있었던 메서드의 정보와 예외 메시지를 화면에 출력한다.
            System.out.println(e.getMessage());     // 발생한 예외 클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Exception");
        }
        System.out.println(6);

        // 멀티 캐치 블럭 - 내용이 같은 catch블럭을 하나로 합친 것
        try {
            
        } catch (ArithmeticException | NullPointerException e) {        // 부모 자식 관계가 들어가면 안된다. 어차피 상속 관계면 부모든 자식이든 다 해결할 수 있음
            e.printStackTrace();        // 공통된 것 외에는 다른 메서드는 사용할 수 없다. --> 쓰고 싶으면 다형성을 통한 형변환이 필요함
        }
    }
}