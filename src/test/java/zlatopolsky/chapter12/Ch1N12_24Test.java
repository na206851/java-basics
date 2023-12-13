package zlatopolsky.chapter12;

import java.util.Arrays;

public class Ch1N12_24Test {
    public static void main(String[] args) {
        Ch1N12_24 test = new Ch1N12_24();
        int[][] arr = new int[][]{
                {1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5, 6},
                {1, 3, 6, 10, 15, 21},
                {1, 4, 10, 20, 35, 56},
                {1, 5, 15, 35, 70, 126},
                {1, 6, 21, 56, 126, 252}};
        System.out.println(Arrays.deepEquals(test.expressionA(6, 6), arr));

        int[][] arrB = new int[][]{
                {1, 2, 3, 4, 5, 6},
                {2, 3, 4, 5, 6, 1},
                {3, 4, 5, 6, 1, 2},
                {4, 5, 6, 1, 2, 3},
                {5, 6, 1, 2, 3, 4},
                {6, 1, 2, 3, 4, 5}};
        System.out.println(Arrays.deepEquals(test.expressionB(6, 6), arrB));
    }
}
