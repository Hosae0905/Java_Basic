package Enum;

/**
 * 열거형의 조상 Enum
 * 모든 열거형은 Enum의 자손이며 메서드를 상속받는다.
 * values(), valueOf()는 조상의 메서드가 아니지만 컴파일러가 자동으로 추가해준다.
 */

enum Direction { EAST, SOUTH, WEST, NORTH }

public class Ex_2 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        System.out.println("d1 == d2 " + (d1 == d2));
        System.out.println("d1 == d3 " + (d1 == d3));
        System.out.println("d1.compareTo(d3) " + (d1.compareTo(d3)));
        System.out.println("d1.compareTo(d2) " + (d1.compareTo(d2)));
//        System.out.println("d1 > d3 " + (d1 > d3));       // 열거형은 비교 연산자 사용 불가

        Direction[] dArr = Direction.values();      // values()는 열거형의 모든 상수를 배열로 반환해준다.

        for (Direction d : dArr) {
            System.out.printf("%s = %d%n", d.name(), d.ordinal());      // name()은 상수의 이름을 ordinal()은 순서를 알려준다.
        }
    }
}
