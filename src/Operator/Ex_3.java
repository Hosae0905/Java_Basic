package Operator;

/**
 * 증감 연산자
 * 증가 연산자 + 감소 연산자
 * 증감 연산자에는 전위형과 후위형으로 구분된다.
 * 증감 연산자가 독립적으로 사용된 경우 전위형과 후위형의 차이가 없다.
 *
 * 부호 연산자
 * - : 피연산자의 부호를 반대로 변경
 * + : 아무런 일도 하지 않음 (실제로 사용하지 않음)
 */

public class Ex_3 {
    public static void main(String[] args) {
        int i = 1;
        int j = ++i;

        System.out.println("i = " + i + " j = " + j);

        j = i++;
        System.out.println("i = " + i + " j = " + j);

        i = -10;
        i = -i;
        System.out.println(i);

    }
}
