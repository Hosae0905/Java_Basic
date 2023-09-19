package Variable;

/**
 * 타입간의 변환 방법
 * 1. 문자와 숫자간의 변환 - 아스키코드 활용
 * 2. 문자열로의 변환 - 빈문자열 활용
 * 3. 문자열을 숫자로 변환 - Integer.parseInt() 사용
 * 4. 문자열을 문자로 변환 - charAt() 사용
 */

public class Ex_9 {
    public static void main(String[] args) {

        // TODO: 1. 문자와 숫자간의 변환
        // 문자를 숫자로
        int num = '3' - '0';

        // 숫자를 문자로
        char ch = 3 + '0';

        // TODO: 2. 숫자를 문자열로 변환
        String str = 3 + "";

        // TODO: 3. 문자열을 숫자로 변환
        int num1 = Integer.parseInt("100");

        // TODO: 4. 문자열을 문자로 변환
        char ch1 = "3".charAt(0);

        System.out.println(num);
        System.out.println(ch);
        System.out.println(str);
        System.out.println(num1);
        System.out.println(ch1);

    }
}
