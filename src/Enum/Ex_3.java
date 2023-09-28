package Enum;

/**
 * 열거형에 멤버 추가하기
 * 불연속적인 열거형 상수의 경우 원하는 값을 괄호안에 적는다.
 * 괄호를 사용하려면 인스턴스 변수와 생성자를 새로 추가해줘야한다.
 * 열거형 생성자는 묵시적으로 private이므로 외부에서 객체생성이 불가하다.
 *
 */

enum Direction1 {
    EAST(1, ">"), SOUTH(2, "v"), WEST(3, "<"), NORTH(4, "^");

    private static final Direction1[] DIR_ARR = Direction1.values();
    private final int value;
    private final String direct;

    Direction1(int value, String direct) {
        this.value = value;
        this.direct = direct;
    }

    public int getValue()   { return value; }
    public String getDirect() { return direct; }

    public static Direction1 of(int dir) {
        if (dir < 1 || dir > 4) {
            throw new IllegalArgumentException("Invalid value : " + dir);
        }
        return DIR_ARR[dir - 1];
    }

    public Direction1 rotate(int num) {
        num = num % 4;

        if (num < 0) num += 4;

        return DIR_ARR[(value - 1 + num) % 4];
    }

    public String toString() {
        return name() + getDirect();
    }
}

public class Ex_3 {
    public static void main(String[] args) {
        for (Direction1 d : Direction1.values()) {
            System.out.printf("%s=%d%n", d.name(), d.getValue());
        }

        Direction1 d1 = Direction1.EAST;
        Direction1 d2 = Direction1.of(1);

        System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
        System.out.printf("d2=%s, %d%n", d2.name(), d2.getValue());
        System.out.println(Direction1.EAST.rotate(1));
        System.out.println(Direction1.EAST.rotate(2));
        System.out.println(Direction1.EAST.rotate(-1));
        System.out.println(Direction1.EAST.rotate(-2));
    }
}
