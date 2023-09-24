package Lang_Pakcage_Other_Class;

import java.util.ArrayList;

/**
 * 오토박싱과 언박싱
 * 오토박싱 --> 기본형을 자동으로 래퍼 클래스로 변환해주는 것을 의미한다.
 * 언박싱 --> 래퍼 클래스를 자동으로 기본형으로 변환해주는 것을 의미한다.
 *
 */

public class Ex_10 {
    public static void main(String[] args) {

        // TODO: 문자열을 숫자로 변환하기
        System.out.println(new Integer("100").intValue());
        System.out.println(Integer.parseInt("30"));
        System.out.println(Integer.valueOf("50"));


        // TODO: n진법 숫자로 변환하기
        System.out.println(Integer.parseInt("100"));
        System.out.println(Integer.parseInt("100", 2));
        System.out.println(Integer.parseInt("100", 8));
        System.out.println(Integer.parseInt("100", 16));
        System.out.println(Integer.parseInt("FF", 16));

        // TODO: 오토박싱과 언박싱
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(100);      // 컴파일 하면 컴파일러가 list.add(new Integer(100)); 이렇게 변환해서 실행하게 된다.
        int value = list.get(0);    // 컴파일 하면 컴파일러가 list.get(0).intValue(); 이렇게 변환해서 실행한다.
    }
}
