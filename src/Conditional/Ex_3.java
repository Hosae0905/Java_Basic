package Conditional;

/**
 * 임의의 정수(난수) 만들기
 * Math.random() 메서드를 사용하여 난수를 만들 수 있다.
 * 0.0 <= Math.random() < 1.0 --> double 값을 반환함.
 *
 * 임의의 정수 만드는 방법
 * - 각 변에 원하는 개별 값의 개수를 곱한다.
 * - 각 변을 int형으로 변환한다.
 * - 각 변에 1을 더한다. (int 형으로 형변환 하면 소수점이 없어지기 때문에)
 */

public class Ex_3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(Math.random());          // 0.0 ~ 1.0까지 double형 난수값
            System.out.println(Math.random() * 10);     // 0.0 ~ 10.0까지 double형 난수값
            System.out.println((int) (Math.random() * 10));     // 0 ~ 9까지 int형 난수값
            System.out.println((int) (Math.random() * 10) + 1); // 1 ~ 10까지 int형 난수값
        }
    }
}
