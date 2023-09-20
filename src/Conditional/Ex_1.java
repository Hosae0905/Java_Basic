package Conditional;

/**
 * 조건문
 * 조건을 만족할때만 {}를 수행(0 ~ 1번)
 *
 * if문
 * - 조건식이 참일 때, 블럭{} 안의 문장들을 수행한다.
 * - if문의 조건으로 들어오는 값은 true 아니면 false가 되야 한다.
 *
 * else-if문
 * 여러 개의 조건식을 포함한 조건식이다.
 */

public class Ex_1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // TODO: if문
        if (a > b) System.out.println(a);       // 수행할 내용이 한 개만 있다면 블럭없이 처리가 가능하다.

        if (a > b) {                            // 수행할 내용이 한 개 이상이면 블럭을 사용해서 처리해야 한다.
            System.out.println(a);
            System.out.println("OK");
        }

        // TODO: if - else문
        if (a > b) {                    // 서로 상반된 조건식이 있다면 else문을 사용해서 처리가 가능하다. (else문은 생략이 가능함)
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        // TODO: if - else if문
        if (a < b) {
            System.out.println(a);
        } else if(a == b) {             // 상위 if문에서 결과값이 false가 나오면 순차적으로 else if문을 확인하게 된다.
            System.out.println("==");
        } else if(a > b) {              // 조건에 해당하는 else if문을 만나면 해당 조건식 내용을 수행한다.
            System.out.println(a);
        }

        // TODO: 중첩 if문 - if문 안의 if문
        if (a > b) {
            if (a > 10) {           // 중첩 if문을 사용할 때는 괄호가 가장 중요하다.
                System.out.println(a);
            } else {                // else문에 괄호를 사용하지 않고 들여쓰기가 되어 있지 않다고 가정하면 오해를 불러일으킬 수 있다.
                System.out.println("a <= 10");
            }
        }
    }
}
