package Lang_Pakcage_Other_Class;

/**
 * Object 클래스
 * 모든 클래스의 최고 조상 오직 11개의 메서드만을 가지고 있다.
 * notify(), wait() 등은 쓰레드와 관련된 메서드이다.
 *
 * equals()
 * 객체 자신과 주어진 객체를 비교한다. 같으면 true, 다르면 false
 *
 */

class EqualsTest {
    int value = 0;

    EqualsTest() {
        this(3);
    }

    EqualsTest(int equalsValue) {
        this.value = equalsValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof EqualsTest)) return false;

        return value == ((EqualsTest) obj).value;       // 형변환을 통해서 받아온 obj 객체를 EqualsTest 객체로 변환해준다.
    }
}

public class Ex_2 {
    public static void main(String[] args) {
        EqualsTest eValue = new EqualsTest();
        EqualsTest eValue1 = new EqualsTest();

        System.out.println(eValue.equals(eValue1));

    }
}
