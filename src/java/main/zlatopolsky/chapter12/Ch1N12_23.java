package zlatopolsky.chapter12;

import static zlatopolsky.chapter12.Ch1N12_263.printMatrix;

public class Ch1N12_23 {

    public int[][] expressionA(int n, int m) {
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j || i + j == matrix.length - 1) {
                    matrix[i][j] = 1;
                }
            }
        }
        printMatrix(matrix);
        return matrix;
    }

    public int[][] expressionB(int n, int m) {
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j || i + j == matrix.length - 1 || i == 3 || j == 3) {
                    matrix[i][j] = 1;
                }
            }
        }
        printMatrix(matrix);
        return matrix;
    }

    public int[][] expressionV(int n, int m) {
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((j >= i && j < n - i) || (j <= i) && (j >= matrix.length - 1 - i)) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        printMatrix(matrix);
        return matrix;
    }
}
