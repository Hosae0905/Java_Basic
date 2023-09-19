package Variable;

import java.util.Scanner;

/**
 * Scanner
 * 화면으로부터 데이터를 입력받는 기능을 제공하는 클래스
 * 
 * Scanner 사용
 * - import문 추가
 * - Scanner 객체 생성
 * - Scanner 객체 사용
 *
 *
 *
 */

public class Ex_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();     // 정수를 입력받는다.
        float f = sc.nextFloat();   // 실수를 입력받는다.
        String str = sc.next();     // 문자열을 받는다.

        int change = Integer.parseInt(str);

        System.out.println(num);
        System.out.println(f);
        System.out.println(str);
        System.out.println(change);

    }
}
