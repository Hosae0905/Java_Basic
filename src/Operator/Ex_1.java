package Operator;

/**
 * 연산자
 * 연산자: 연산을 수행하는 기호를 뜻함
 * 피연산자: 연산자의 연산 수행 대상
 * 모든 연산자는 연산결과를 반환한다.
 *
 * 연산자의 종류
 * - 산술 연산자: + - * / % << >> (사칙 연산과 나머지 연산, 쉬프트 연산은 잘 사용하지 않음)
 * - 비교 연산자: > < >= <= == != (크고 작음과 같고 다름을 비교)
 * - 논리 연산자: && || ! & | ^ ~ ('그리고' 와 '또는' 으로 조건을 연결)
 * - 대입 연산자: = (우변의 값을 좌변에 저장)
 * - 기타: (type) ? : instanceof (형변환 연산자, 삼항 연산자, instanceof 연산자)
 */

public class Ex_1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // TODO: 산술 연산자
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // TODO: 비교 연산자
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);

        // TODO: 논리 연산자
        System.out.println(a > b && a != b);
        System.out.println(a < b || a > b);
        System.out.println(!(a > b));

        // TODO: 대입 연산자
        a = b;
        System.out.println(a);

        // TODO: 기타 연산자 (instanceof 연산자는 객체지향 개념에서 참고)
        char ch;
        ch = (char)a;   // 형변환 연산자
        System.out.println(ch);
        System.out.println(a > b ? a : b);
    }
}
