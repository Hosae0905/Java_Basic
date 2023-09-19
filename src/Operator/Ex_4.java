package Operator;

/**
 * 형변환 연산자
 *
 * 산술 변환
 * 연산 전에 피연산자의 타입을 일치시키는 것
 * 1. 두 피연산자의 타입을 같게 일치시킨다. (보다 큰 타입으로 일치)
 * 2. 피연산자의 타입이 int보다 작은 타입이면 int로 변환된다.
 *
 */

public class Ex_4 {
    public static void main(String[] args) {
        // TODO: double --> int
        double a = 85.4;
        int b = (int) a;    // a의 값을 참조해서 사용하기 때문에 실제 a의 값은 변하지 않는다.
                            // 실수를 정수로 형변환할 때 소수점은 버린다. (반올림 하지 않음)

        System.out.println("a = " + a + " b = " + b);

        // TODO: char <--> int
        char ch = (char)65;     // 아스키코드를 활용하여 숫자를 문자로, 문자를 숫자로 변환해준다.
        int num = (int)ch;

        System.out.println(ch);
        System.out.println(num);

        // TODO: 자동 형변환
        // 같은 크기인 char와 short는 서로 형변환할 수 없다.
        // short와 char의 범위가 다르기 때문

        float f = 1234;     // int 타입의 값을 float 타입의 변수에 저장할 수 있다.
//        float f = (float) 1234;       // 위의 코드를 실행하면 해당 코드처럼 컴파일러가 자동으로 형변환해준다.
//        int c = 3.14f;                // int 타입보다 float 타입의 범위가 넓기 때문에 값 손실이 발생할수 있어 직접 형변환해야 한다.

        byte bt = 100;      // 현재 대입하는 값은 리터럴이므로 컴파일러가 100이라는 값을 명확하게 알고 있어 자동 형변환이 가능하다.
        int i = 100;
        bt = (byte) i;         // i라는 int 타입의 변수를 대입하기 때문에 컴파일러가 명확하게 값을 알 수 없어 수동 형변환을 해줘야 한다.
    }
}
