package Lang_Pakcage_Other_Class;

/**
 * Number 클래스
 * 모든 숫자 래퍼 클래스의 조상
 *
 * 래퍼(wrapper) 클래스
 * 8개의 기본형을 객체로 다뤄야할 때 사용하는 클래스
 * 기본형을 감싸는 클래스라 생각하자
 * 객체지향 언어는 모든 것이 객체로 이루어져야 한다. 하지만 자바에서는 성능을 위해서 기본형을 만들게 되었다.
 * 그런 기본형들을 객체로 사용할 때 필요한 것이 래퍼 클래스이다.
 *
 */

public class Ex_9 {
    public static void main(String[] args) {

        // TODO: Inter 래퍼 클래스 사용
        Integer num1 = new Integer(100);
        Integer num2 = new Integer(100);

        System.out.println("num1 == num2 ? " + (num1 == num2));
        System.out.println("num1.equals(num2) = " + num1.equals(num2));
        System.out.println("num1.compareTo(num2) = " + num1.compareTo(num2));
        System.out.println("num1.toString() = " + num1.toString());

        System.out.println("Integer MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer SIZE = " + Integer.SIZE);
        System.out.println("Integer BYTES = " + Integer.BYTES);
        System.out.println("Integer TYPE = " + Integer.TYPE);
    }
}
