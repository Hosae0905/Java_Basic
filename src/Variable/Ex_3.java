package Variable;

/**
 * 상수
 * 한 번만 값을 저장 가능한 변수
 * 한 번 정해진 값은 변경이 불가능 하다.
 * 
 * 리터럴
 * 그 자체로 값을 의미하는 것 - 상수랑 같은 개념
 * 상수와 구별하기 위해서 리터럴이라는 의미를 만든 것임
 */

public class Ex_3 {
    public static void main(String[] args) {
        int a = 10;     // a는 변수 10은 리터럴
        a = 20;         // 값을 변경할 수 있음

        final int b = 30;   // b는 상수 30은 리터럴
//        b = 40;           // 값을 변경할 수 없음

    }
}
