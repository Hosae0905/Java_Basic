package Array;

/**
 * 배열의 활용
 */

public class Ex_2 {
    public static void main(String[] args) {
        int sum = 0;
        float avg = 0f;

        int[] score = {100, 88, 72, 65, 92};

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }

        avg = sum / (float)score.length;

        System.out.println("총합: " + sum + " 평균 : " + avg);
    }
}
