package Collections;

import java.util.Arrays;

/**
 * Arrays
 * 배열을 다루기 편리한 메서드(static)을 제공한다.
 *
 */

public class Ex_3 {
    public static void main(String[] args) {

        // TODO: 배열 출력 --> Arrays.toString()
        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2D = {{0, 1, 2}, {2, 3, 4}};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr2D));     // 2차원 배열은 toString() 할 시에 이상한 값이 출력된다.

        // TODO: 배열 복사 --> Arrays.copyOf()
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOfRange(arr, 1, 3);

        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("arr3 = " + Arrays.toString(arr3));

        // TODO: 배열 채우기 --> Arrays.fill(), Arrays.setAll()
        int[] arr4 = new int[5];
        Arrays.fill(arr4, 5);
        System.out.println("arr4 = " + Arrays.toString(arr4));

        Arrays.setAll(arr4, i -> (int)(Math.random() * 5) + 1);
        System.out.println("arr4 = " + Arrays.toString(arr4));

        // TODO: 배열 비교 --> Arrays.equals(), Arrays.deepEquals()
        int[][] arr5 = {{1, 2, 3}, {4, 5, 6}};
        int[][] arr6 = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(Arrays.equals(arr5, arr6));      // 2차원 배열을 비교할 때 equals() 메서드를 사용하면 false값이 출력된다.
        System.out.println(Arrays.deepEquals(arr5, arr6));

        // TODO: 배열 정렬 & 검색 --> Arrays.sort(), Arrays.binarySearch()
        int[] arr7 = {4, 6, 2, 3, 1};
        char[] chArr = {'B', 'C', 'A', 'F', 'Z'};
        System.out.println(Arrays.binarySearch(chArr, 'A'));

        Arrays.sort(arr7);
        Arrays.sort(chArr);
        System.out.println(Arrays.toString(arr7));
        System.out.println(Arrays.toString(chArr));
    }
}
