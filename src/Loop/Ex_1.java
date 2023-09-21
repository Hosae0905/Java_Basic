package Loop;

/**
 * 반복문
 * 조건을 만족하는 동안 {}를 수행(0 ~ n번)
 * 
 * for문
 * 조건을 만족하는 동안 블럭{}을 반복 실행
 * 반복 횟수를 알 때 적합함
 *
 * for문 실행 순서
 * 1. 변수를 먼저 초기화 해준다. (for문을 실행하는 동안 한 번만 초기화 된다.)
 * 2. 조건식을 수행한다.
 * 3. 조건식이 true면 블럭 안의 문장들을 수행한다.
 * 4. 증감식을 수행한다.
 */

public class Ex_1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {      // 초기화; 조건식; 증감식; 순서이다.
            System.out.println(i);
        }

        for (int i = 1; i < 5; i++) {       //  중첩 for문
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " X " + j + " = " + (i*j));
            }
        }
    }
}
