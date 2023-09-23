package Lang_Pakcage_Other_Class;

/**
 * StringBuffer 클래스
 * String처럼 문자형 배열을 내부적으로 가지고 있다.
 * String과 달리 내용을 변경할 수 있다.
 *
 * StringBuffer의 생성자
 * 배열은 길이 변경이 불가하다. --> 공간이 부족하면 새로운 배열을 생성해야 된다.
 * StringBuffer는 저장할 문자열의 길이를 고려해서 적절한 크기로 생성해야 한다.
 *
 * StringBuffer의 변경
 * append()는 지정된 내용을 StringBuffer에 추가 후, StringBuffer의 참조를 반환한다.
 * StringBuffer는 equals()가 오버라이딩이 되어있지 않다. (주소를 비교함)
 * 비교를 하기 위해서는 String으로 변환 후에 equals로 비교해야 한다.
 */

public class Ex_6 {
    public static void main(String[] args) {
        StringBuffer bf = new StringBuffer("ABC");
        bf.append("123");
        System.out.println(bf.hashCode());      // 같은 주소값을 가진다
        bf.append("EFG");
        System.out.println(bf.hashCode());      // 같은 주소값을 가진다.
        System.out.println(bf.toString());

        bf.append("AAA").append("BBB");     // bf.append("AAA") 를 실행하면 StringBuffer를 반환하기 때문에 바로 append를 붙여서 사용할 수 있다.
        System.out.println(bf.toString());
    }
}
