package zlatopolsky.chapter12;

import static zlatopolsky.chapter12.Ch1N12_263.printMatrix;

public class Ch1N12_24 {

    public int[][] expressionA(int n, int m) {
        int[][] matrix = new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == 0 || j == 0) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
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
                matrix[i][j] = (i + j) % m + 1;
            }
        }
        printMatrix(matrix);
        return matrix;
    }
}
