package Loop;

import java.util.Scanner;

/**
 * while문
 * 조건을 만족시키는 동안 블럭{}을 반복 - 반복횟수를 모를 때
 * for문과 while문은 서로 변경이 가능하다.
 * 
 * do-while문
 * 블럭{}을 최소한 한 번 이상 반복한다. - 사용자 입력 받을 때 유용
 */

public class Ex_2 {
    public static void main(String[] args) {
        int i = 5;

        while (i != 0) {
            i--;
            System.out.println(i);
        }

        System.out.println("=============while문===================");

        int sum = 0;
        int j = 0;

        while (sum <= 100) {
            System.out.printf("%d - %d\n", j, sum);
            sum += ++j;
        }

        System.out.println("=============do-while문====================");

        Scanner sc = new Scanner(System.in);
        int k = 0;

        do {
            k = sc.nextInt();
            if (k != 0) {
                System.out.println("입력한 값 = " + k);
                System.out.print("다시 입력하기 >>>");
            }
        } while (k != 0);

        System.out.println("=============break문===================");

        int n = 0;
        int m = 0;

        while (true) {
            if (m > 100) break;         // 조건문이 true가 나오면 while문을 벗어난다.
            ++n;
            m += n;
        }

        System.out.printf("n = " + n + " m = " + m + "\n");

        System.out.println("=============continue문===================");

        for (int a = 0; a <= 10; a++) {
            if (a % 2 == 1) continue;       // 자신이 포함된 반복문의 끝으로 이동 - 다음 반복으로 넘어감
            System.out.println(a);

        }

        System.out.println("=============이름있는 break문===================");

        int result = 0;

        Loop : for (int b = 0; b < 10; b++) {
            for (int c = 4; c < 10; c++) {
                result += b;
                if (b == c) break Loop;
            }
        }

        System.out.println(result);
    }
}
