package java.zlatopolsky.chapter12;

import java.util.Arrays;

public class Ch1N12_263 {

    public int[][] fillingTheArray(int n, int m) {
        int[][] matrix = new int[n][m];
        int count = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = count++;
            }
        }
        return matrix;
    }

    public int[][] deletingTheLine(int[][] matrix, int k) {
        if (k < 0 || k >= matrix.length) {
            return matrix;
        }
        int[] tmp = new int[matrix.length];
        for (int i = k + 1; i < matrix.length; i++) {
            matrix[i - 1] = matrix[i];
        }
        matrix[matrix.length - 1] = tmp;
        return matrix;
    }

    public int[][] deletingTheColon(int[][] matrix, int k) {
        if (k >= 0 && k < matrix[0].length) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = k; j < matrix[i].length - 1; j++) {
                    matrix[i][j] = matrix[i][j + 1];
                }
                matrix[i] = Arrays.copyOf(matrix[i], matrix[i].length - 1);
            }
        }
        return matrix;
    }

    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}