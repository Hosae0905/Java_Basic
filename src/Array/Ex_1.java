package Array;

import java.util.Arrays;

/**
 * 배열
 * 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
 * 배열을 다루기 위해서는 참조변수를 선언해줘야한다.
 * 배열은 한 번 생성하면 실행하는 동안 그 길이를 바꿀 수 없다.
 * 배열의 길이를 고정시키는 이유는 만약 메모리에서 내가 설정한 배열의 길이만큼 메모리를 차지하게 되는데 길이를 늘려 버리면
 * 배열은 연속적인 값이 들어오게 되는데 내가 설정한 배열의 길이 뒤에 늘린 길이 만큼 메모리 공간이 있다고 확신할 수 없다.
 * 길이를 늘리고 싶으면 배열의 크기를 크게 설정하고 기존 벼열의 내용을 복사해야 된다.
 *
 * 배열의 인덱스
 * 배열을 생성하면 각 저장공간에 index가 생긴다.
 * 인덱스의 범위는 0부터 시작해서 배열의 길이 - 1까지 생성된다.
 */

public class Ex_1 {
    public static void main(String[] args) {
        int[] num;          // 배열을 선언(참조변수 선언)
        num = new int[5];   // 배열을 생성(실제 저장공간을 생성)

        num[1] = 10;        // 인덱스 값을 넣어줘서 값을 초기화 해준다.

        System.out.println(num[1]);

        // TODO: 배열의 길이
        System.out.println(num.length);     // 길이를 바꿀 수 없기 때문에 배열의 길이는 int형 상수가 된다.

        // TODO: 배열의 초기화 - 배열의 각 요소에 처음으로 값을 저장하는 것

        num[0] = 10;        // 각 인덱스에 대해서 값을 대입해 초기화할 수 있다.
        num[1] = 20;
        num[2] = 30;
        num[3] = 40;
        num[4] = 50;

        for (int i = 0; i < num.length; i++) {      // 반복문을 통해서 초기화가 가능하다.
            num[i] = i * 10;
        }

        int[] num1 = {50, 40, 30, 20, 10};      // 참조변수 선언과 동시에 값을 설정할 수 있다.

        // TODO: 배열의 출력
        System.out.println(num);        // 배열의 주소값을 출력한다.

        for (int i = 0; i < num.length; i++) {      // 각 요소를 순서대로 하나씩 뽑아서 출력해준다.
            System.out.println(num[i]);
        }

        System.out.println(Arrays.toString(num));       // Arrays 클래스에 있는 toString 메서드를 사용해서 출력이 가능하다. (문자열로 출력됨)

        char[] chArr = {'a', 'b', 'c'};
        System.out.println(chArr);      // char 배열일 때만 값을 그대로 출력해준다.

    }
}
