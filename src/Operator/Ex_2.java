package Operator;

/**
 * 연산자 우선순위
 * 하나의 식에 연산자가 둘 이상 있을때 어떤 연산을 먼저 수행할지를 자동 결정하는 것을 뜻한다.
 * 괄호를 통해서 우선순위를 수동으로 정할 수 있다.
 * 
 * 우선순위
 * 단항 연산자 > 산술 연산자 > 비교 연산자 > 논리 연산자 > 삼항 연산자 > 대입 연산자
 *
 * 연산자의 결합 규칙
 * 우선순위가 같으면 어떤 것을 먼저 할 것인지 정하는 것을 결합 규칙이라고 한다.
 * 보통 왼쪽에서 부터 연산을 수행한다.
 * 대입 연산과 단항 연산인 경우에만 오른쪽에서 왼쪽으로 수행한다.
 */

public class Ex_2 {
    public static void main(String[] args) {
        int a = 3 + 5 * 2;      // 자동으로 결정되서 * 연산자 먼저 수행되고 + 연산이 수행되서 13이 된다.
        int b = (3 + 5) * 2;    // 괄호로 수동으로 결정해서 + 연산자 먼저 수행되고 * 연산이 수행되서 16이 된다.
        int result = a + b;

        System.out.println(a + " " + b);
        System.out.println(-2 + 3);             // 부호 연산자인 -부터 수행하고 + 연산을 수행한다.
        System.out.println(4 + 3 * 5);          // 같은 산술 연산자에서도 우선순위가 있기 때문에 * 연산을 수행한다.
        System.out.println(2 + 3 > 1 + 1);      // 먼저 산술 연산을 수행한 후 비교 연산을 수행한다.
        System.out.println(3 > 2 && 2 < 3);     // 먼저 비교 연산을 수행한 후 논리 연산을 수행한다.
        System.out.println(result);             // 먼저 a와 b의 산술 연산을 수행한 후 대입 연산을 수행한다.
    }
}