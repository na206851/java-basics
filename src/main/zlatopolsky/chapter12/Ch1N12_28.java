package zlatopolsky.chapter12;

public class Ch1N12_28 {
    /**
     * матрица заполняется по границам (строки, столбцы) после того как строка или столбец заполнен он обрезается
     * нужно подумать как можно написать через рекурсию
     */
    public int[][] spiralMatrix(int n, int m) {
        int[][] matrix = new int[n][m];
        int count = 1;
        int line = 0;
        int maxLine = n - 1;
        int colon = 0;
        int maxColon = m - 1;
        while (count <= n * m) {
            for (int i = colon; i <= maxColon; i++) {
                matrix[line][i] = count++;
            }
            line += 1;
            for (int i = line; i <= maxLine; i++) {
                matrix[i][maxColon] = count++;
            }
            maxColon -= 1;
            for (int i = maxColon; i >= colon; i--) {
                matrix[maxLine][i] = count++;
            }
            maxLine -= 1;
            for (int i = maxLine; i >= line; i--) {
                matrix[i][colon] = count++;
            }
            colon += 1;

        }
        print(matrix);
        return matrix;
    }

    public void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
