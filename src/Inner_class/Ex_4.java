package Inner_class;

/**
 * 익명 클래스
 * 이름이 없는 일회용 클래스
 * 정의와 생성을 동시에한다.
 *
 * 이름이 없기 때문에 객체를 생성할 때 조상클래스의 이름이나 구현 인터페이스 이름을 대신해서 사용한다.
 */

public class Ex_4 {
    static Object cv = new Object() { void method(){
        System.out.println("익명 클래스2");
    } };
    public static void main(String[] args) {
        Object iv = new Object() { void method(){
            System.out.println("익명 클래스1");
        } };

        System.out.println(iv);
        System.out.println(cv);     // 클래스 변수이기 때문에 먼저 만들어짐
        method();
    }

    static void method() {
        Object lv = new Object() { void method(){
            System.out.println("익명 클래스3");
        } };
    }
}
