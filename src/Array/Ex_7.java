package Array;

/**
 * String 클래스
 * char[]와 메서드(기능)을 결합한 것
 * String 클래스는 내용을 변경할 수 없다. (read only)
 * 기존의 값이 바뀌는게 아니라 새로운 것이 만들어지는 것이다.
 */

public class Ex_7 {
    public static void main(String[] args) {
        String str = "ABCDE";

        System.out.println(str.charAt(3));
        System.out.println(str.length());
        System.out.println(str.substring(1, 4));
        System.out.println(str.equals("ABC"));
        System.out.println(str.toCharArray());
    }
}
