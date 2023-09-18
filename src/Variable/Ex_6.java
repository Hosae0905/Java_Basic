package Variable;

/**
 * 두 변수의 값을 교환하기
 * 두 변수의 값을 교환하기 위해서는 값을 따로 저장하기 위한 새로운 변수를 생성해야 한다.
 */

public class Ex_6 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int temp;

        temp = a;       // a = 10 | b = 20 | temp = 10
        a = b;          // a = 20 | b = 20 | temp = 10
        b = temp;       // a = 20 | b = 10 | temp = 10
    }
}
