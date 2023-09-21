package Array;

/**
 * 2차원 배열
 * 테이블 형태의 데이터를 저장하기 위한 배열
 */

public class Ex_5 {
    public static void main(String[] args) {
        int[][] num = new int[4][3];        // new int[행][열];
        int[][] num1 = {        // 생성과 초기화를 동시에 하는 방법
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println(num1.length);

        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1[i].length; j++) {
                System.out.printf("[%d][%d] = %d, %d\n", i, j, num1[i][j], num1[i][j]);
            }
        }

    }
}
