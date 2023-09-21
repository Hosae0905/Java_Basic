package Array;

import java.util.Arrays;

/**
 * String 배열
 * 문자열을 담을 수 있는 배열
 */

public class Ex_3 {
    public static void main(String[] args) {
        String[] strArr = {"A", "B", "C"};
        System.out.println(Arrays.toString(strArr));

        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[(int)(Math.random() * 3)]);
        }
    }
}
