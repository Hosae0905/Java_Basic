package Lang_Pakcage_Other_Class;

import java.util.Objects;

/**
 * hashCode()
 * - 객체의 해시코드를 반환하는 메서드
 * - Object 클래스의 hashCode()는 객체의 주소를 int로 변환해서 반환
 * - 객체의 지문이라고 부르기도 한다.
 * - equals()를 오버라이딩하면 hashCode()도 오버라이딩해야 한다.
 * - equals()의 결과가 true인 두 객체의 해시코드는 같아야 하기 떄문
 *  - public native int hashCode(); --> native는 os가 가지고 있는 메서드를 의미한다.
 *  
 *  toString()
 *  - 객체를 문자열로 변환하기 위한 메서드
 */

class Test {
    String testStr = "";
    int testInt = 0;

    Test() {
        this("Test!!", 10);
    }

    Test(String testStr, int testInt) {
        this.testStr = testStr;
        this.testInt = testInt;
    }

    @Override
    public String toString() {
        return "testStr: " + testStr + " testInt: " + testInt;
    }

    @Override
    public int hashCode() {
        return Objects.hash(testStr, testInt);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Test)) {
            return false;
        }

        Test t = (Test) obj;
        return this.testStr.equals(t.testStr) && this.testInt == t.testInt;
    }
}

public class Ex_1 {
    public static void main(String[] args) {

        // TODO: hashCode()
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        // TODO: toString()
        Test a = new Test();
        Test b = new Test();

        System.out.println(a.equals(b));        // false --> true
        System.out.println(a.hashCode());       // 990368553 --> 242136505
        System.out.println(b.hashCode());       // 1096979270 --> 242136505

        System.out.println(new Test().toString());
        System.out.println(new Test("TestCode", 30).toString());
    }
}
