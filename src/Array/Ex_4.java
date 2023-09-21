package Array;

import java.util.Arrays;

/**
 * 커맨드 라인을 통해 문자열 입력받기
 */

public class Ex_4 {
    public static void main(String[] args) {
        System.out.println("매개변수의 개수" + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
