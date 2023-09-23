package Lang_Pakcage_Other_Class;

/**
 * join()과 StringJoiner
 * join()은 여러 문자열 사이에 구분자를 넣어서 결합한다.
 *
 * 문자열과 기본형 간의 변환
 * - 숫자를 문자열로 바꾸는 방법
 * 빈 문자열 더해주기       --> 편리함
 * valueOf() 메서드 사용하기  --> 속도가 빠름
 *
 * 문자열을 숫자로 바꾸는 방법
 * Inter.parseInt() 메서드를 사용하기
 * valueOf() 메서드를 사용하기 --> 참조형을 반환해준다.
 */

public class Ex_5 {
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");
        String newArr = String.join("-", arr);
        System.out.println(newArr);

        // TODO: 숫자를 문자로 변환
        int num = 100;
        String str1 = num + "";
        String str2 = String.valueOf(num);

        // TODO: 문자를 숫자로 변환
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.valueOf(str2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(num1);
        System.out.println(num2);
    }
}
