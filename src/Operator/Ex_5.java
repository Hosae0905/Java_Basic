package Operator;

/**
 * 반올림 - Math.round()
 * 실수를 소수점 첫 째자리에서 반올림한 정수를 반환
 */

public class Ex_5 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double result = Math.round(pi * 1000) / 1000.0;
        System.out.println(result);
    }
}
