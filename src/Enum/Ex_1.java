package Enum;

/**
 * 열거형
 * 서로 관련된 상수들을 같이 묶어 놓은 것
 * 자바는 타입에 안전한 열거형을 제공해준다. --> 값하고 타입을 모두 체크해준다.
 *
 * enum 열거형 이름 { 상수명1, 상수명2, ... }  0부터 값으로 들어간다.
 * 열거형 타입의 변수를 선언하고 대입해서 사용할 수 있다.
 * 열거형 상수 비교는 동등 연산자와 compareTo()를 사용할 수 있다. --> 비교 연산자는 사용이 불가하다. (compareTo()로 비교함)
 */

public class Ex_1 {
    static final int ONE = 0;
    static final int TWO = 1;
    static final int THREE = 2;

    static final int FIRST = 0;
    static final int SECOND = 1;
    static final int THIRD = 2;

    public static void main(String[] args) {

        enum Number1 { ONE, TWO, THREE }
        enum Floor { FIRST, SECOND, THIRD }

        final Number1 num;           // 기본형 타입이 아닌 Number 타입이다.
        final Floor floor;

        if (Ex_1.ONE == Ex_1.FIRST) System.out.println(true);      // 일반적인 상수는 값만 비교하기 때문에 true가 나온다.
        else System.out.println(false);

//        if (Number.ZERO == Floor.FIRST)       // 열거형은 값과 타입도 같이 비교하기 때문에 컴파일 에러가 발생한다.

        num = Number1.TWO;
        floor = Floor.SECOND;

        if (num == Number1.TWO) {
            System.out.println("같은 값입니다.");
        }
    }
}
