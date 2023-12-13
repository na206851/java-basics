package java.zlatopolsky.chapter12;

import java.util.Arrays;

public class Ch1N12_23_Test {
    public static void main(String[] args) {
        Ch1N12_23 test = new Ch1N12_23();
        int[][] matrixTestA = new int[][]{
                {1, 0, 0, 0, 0, 0, 1},
                {0, 1, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 1, 0},
                {1, 0, 0, 0, 0, 0, 1}};
        System.out.println(Arrays.deepEquals(test.expressionA(7, 7), matrixTestA));

        int[][] matrixTestB = new int[][]{
                {1, 0, 0, 1, 0, 0, 1},
                {0, 1, 0, 1, 0, 1, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {1, 1, 1, 1, 1, 1, 1},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 1, 0, 1, 0, 1, 0},
                {1, 0, 0, 1, 0, 0, 1}};
        System.out.println(Arrays.deepEquals(test.expressionB(7, 7), matrixTestB));

        int[][] matrixTestV = new int[][]{
                {1, 1, 1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 1, 1}};
        System.out.println(Arrays.deepEquals(test.expressionV(7, 7), matrixTestV));
    }
}
