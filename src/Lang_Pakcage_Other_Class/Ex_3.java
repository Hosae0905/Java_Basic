package Lang_Pakcage_Other_Class;

/**
 * String 클래스
 * 문자열을 다루기 위한 클래스
 * 데이터(char[]) + 메서드(문자열 관련)
 * 내용을 변경할 수 없는 불변 클래스
 * 덧셈을 이용한 문자열 결합은 성능이 떨어짐
 * 문자열을 결합이나 변경이 잦다면 StringBuffer 클래스를 사용 - 내용을 바꿀 수 있음
 *
 * 문자열 비교
 * 리터럴을 이용해서 만드는 방법과 객체를 생성해서 만드는 방법이 있다.
 * 어차피 내용을 변경할 수 없기 때문에 객체를 생성해서 만드는 방법을 쓸 필요가 없다.
 * 문자열 리터럴은 프로그램 실행시 자동으로 생성된다. (constant pool에 저장됨)
 *
 * 빈 문자열
 * 내용이 없는 문자열
 * 길이가 0인 char형 배열을 저장하는 문자열
 * 길이가 0인 배열을 생성하는 것은 어느 타입이나 가능
 * 숫자를 문자로 변환할때 유용하게 사용한다.
 */

public class Ex_3 {
    public static void main(String[] args) {

        String emptyStr = "";       // 빈 문자열
        String str1 = "AAA";
        String str2 = "AAA";

        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        System.out.println("============================================");

        str1 = str2 + "BBB";        // 값이 바뀌는 것이 아닌 새로운 객체에 값을 담게 된다.
        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}
