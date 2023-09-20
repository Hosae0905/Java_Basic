package Conditional;

/**
 * switch문
 * 처리해야 하는 경우의 수가 많을 때 유용한 조건문이다.
 * 먼저 조건식을 계산한다.
 * 조건식의 결과와 일치하는 case문으로 이동한다.
 * 이후의 문장들을 수행한다.
 * break문이나 switch문의 끝을 만나면 switch문 전체를 빠져나간다.
 *
 * switch문의 제약조건
 * - 조건식 결과는 정수 또는 문자열이어야 한다.
 * - case문의 값은 정수 상수(문자 포함), 문자열만 가능하며, 중복되지 않아야 한다. (변수 불가)
 * - break문이 없다면 모든 case문을 순서대로 확인하게 되기 때문에 break문을 꼭 넣어줘야한다.
 */

public class Ex_2 {
    public static void main(String[] args) {
        int num = 1;
        final int TWO = 2;      // 상수

        switch (num) {
            case '1':
                System.out.println("'1'");
            case TWO:
                System.out.println("TWO");
            case 1:
                System.out.println(1);
                break;
            /*case num:                     // case 문으로 변수가 올 수 없다.
                System.out.println(num);
            case 1.0:                       // case 문으로 실수가 올 수 없다.
                System.out.println(1.0);*/
            default:                        // default문은 break문이 없을 경우 출력되는 문장이다.
                System.out.println("end");
        }
    }
}
