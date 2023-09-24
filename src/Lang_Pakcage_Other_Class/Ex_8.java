package Lang_Pakcage_Other_Class;

/**
 * Math 클래스
 * 수학관련 static 메서드의 집합
 * 
 */

public class Ex_8 {
    public static void main(String[] args) {
        int a = 10;
        int b = -10;
        double c = 12.345;

        
        // TODO: abs() --> 절대값 반환
        System.out.println(Math.abs(a));
        System.out.println(Math.abs(b));        // 절대값이기 때문에 음수가 양수로 나오게 된다.
        
        // TODO: ceil() --> 주어진 값 올림하여 반환
        System.out.println(Math.ceil(c));       // 그냥 올림이기 때문에 10.1도 11이 된다.

        // TODO: floor() --> 주어진 값 버림하여 반환
        System.out.println(Math.floor(c));      // 소수점을 버리기 때문에 10.9는 11이 아닌 10이 된다.

        // TODO: max() --> 주어진 두 값을 비교하여 큰 쪽으로 반환
        System.out.println(Math.max(a, 5));

        // TODO: min() --> 주어진 두 값을 비교하여 작은 쪽을 반환
        System.out.println(Math.min(b, 3));

        // TODO: random() --> 0.0 ~ 1.0 범위의 임의의 double 값을 반환
        System.out.println(Math.random());

        // TODO: rint() --> 주어진 double 값과 가장 가까운 정수값을 double형으로 반환
        System.out.println(Math.rint(1.5));     // 1.5, 2.5 등과 같은 두 정수의 가운데 있는 값은 짝수를 반환한다.
        System.out.println(Math.rint(2.5));     // 따라서 3이 나오지 않고 짝수인 2가 나오게 된다.
        
        // TODO: round() --> 소수점 첫째자리에서 반올림한 정수값을 반환
        System.out.println(Math.round(1.5));        // 두 정수의 가운데 있는 값은 항상 큰 정수를 반환한다.
        System.out.println(Math.round(2.5));        // 오차율이 높아질 수 있다.
        
    }
}
