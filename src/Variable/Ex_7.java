package Variable;

/**
 * 형식화된 출력 - printf()
 * println()의 단점
 * - 실수의 자리수 조절 불가
 * - 10진수로만 출력됨
 *
 * printf()
 * - 실수의 자리수를 표현할 수 있다.
 * - 10진수 외 다른 표현도 가능하다.
 * - 다양한 형식의 출력이 가능하다.
 * - 줄바꿈을 하지 않기 때문에 개행문자를 포함시켜줘야 한다.
 * 
 * printf()의 지시자
 * %b - 불리언 형식으로 출력
 * %d - 10진수 정수의 형식으로 출력
 * %o - 8진수 정수의 형식으로 출력
 * %x, %X - 16진수 정수의 형식으로 출력
 * %f - 부동 소수점의 형식으로 출력
 * %e, %E - 지수 표현식의 형식으로 출력
 * %c - 문자로 출력
 * %s - 문자열로 출력
 * 
 * printf()의 지시자 - 자릿수 지정
 * 지시자 앞에 숫자를 추가하여 자릿수를 지정해서 사용할 수 있다.
 */

public class Ex_7 {
    public static void main(String[] args) {

        // 논리형
        System.out.printf("%b\n", true);

        // 정수형
        System.out.printf("%d\n", 10);
        System.out.printf("%o\n", 15);
        System.out.printf("%#x\n", 15);   // 접두사가 필요한 경우 #을 붙여서 출력하면 된다.

        // 실수형
        System.out.printf("%f\n", 123.45678);
        System.out.printf("%.2f\n", 123.45678);
        System.out.printf("%e\n", 123.45678);

        // 문자형
        System.out.printf("%c\n", 'A');

        // 문자열
        System.out.printf("%s\n", "ABC");

        // 자릿수 지정
        System.out.printf("[%5d]\n", 10);       // 지정한 값보다 더 큰 값을 넣어도 해당 큰 값을 그대로 출력해준다.
        System.out.printf("[%-5d]\n", 10);      // 왼쪽 정렬
        System.out.printf("[%05d]\n", 10);      // 빈 값은 0으로 세팅

    }
}
