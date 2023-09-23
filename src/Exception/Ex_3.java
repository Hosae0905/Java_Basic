package Exception;

/**
 * 메서드에 예외 선언하기
 * try-catch문 말고 예외를 선언해서 처리하는 방법이 있다.
 * 예외를 선언 한다는 것은 발생 가능한 예외를 호출하는 쪽에 알리는 것을 의미한다.
 * 예외가 발생했을 때 직접 처리할 것인지 떠넘길지 아니면 은폐(빈 catch문)를 할지 고민해야한다.
 * throws 키워드를 사용하고 checked 예외만 처리해준다.
 *
 * finally 블럭
 * 예외 발생여부와 관계없이 수행되어야 하는 코드를 넣는다.
 */

public class Ex_3 {
    public static void main(String[] args) {
        try {
            method1("ABC");
            method1("");
        } catch (Exception e) {             // 받은 예외는 필수적으로 try-catch문을 사용해서 처리를 해야된다. (안하면 JVM에서 처리함)
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally 블럭");
        }
    }

    static void method1(String str) throws Exception {
        if (str == "") {
            throw new Exception("빈 문자열입니다.");       // 자신을 호출한 메서드로 예외를 보낸다.
        } else {
            System.out.println(str);
        }
    }
}
