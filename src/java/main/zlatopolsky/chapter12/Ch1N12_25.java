package zlatopolsky.chapter12;

public class Ch1N12_25 {

    public int[][] expressionA(int n, int m) {
        int[][] matrix = new int[n][m];
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = count;
                count++;
            }
        }
        return matrix;
    }

    /**
     * в примере мы поменяли местами строки и столбцы, итеррируемся по столбцам
     */
    public int[][] expressionB(int n, int m) {
        int[][] matrix = new int[n][m];
        int count = 1;
        int index = 0;
        while (index < m) {
            for (int j = 0; j < n; j++) {
                matrix[j][index] = count;
                count++;
            }
            index++;
        }
        return matrix;
    }

    public int[][] expressionV(int n, int m) {
        int[][] matrix = new int[n][m];
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = m - 1; j >= 0; j--) {
                matrix[i][j] = count;
                count++;
            }
        }
        return matrix;
    }

    public int[][] expressionG(int n, int m) {
        int[][] matrix = new int[n][m];
        int count = 1;
        for (int i = 0; i < m; i++) {
            for (int j = n - 1; j >= 0; j--) {
                matrix[j][i] = count++;
            }
        }
        return matrix;
    }

    public int[][] expressionD(int n, int m) {
        int[][] matrix = new int[n][m];
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = count++;
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    matrix[i][j] = count++;
                }
            }
        }
        return matrix;
    }

    public int[][] expressionE(int n, int m) {
        int[][] matrix = new int[n][m];
        int count = 1;
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    matrix[j][i] = count++;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    matrix[j][i] = count++;
                }
            }
        }
        return matrix;
    }

    public int[][] expressionZh(int n, int m) {
        int[][] matrix = new int[n][m];
        int count = 1;
        for (int i = 0; i < m; i++) {
            for (int j = n - 1; j >= 0; j--) {
                matrix[j][i] = count++;
            }
        }
        return matrix;
    }

    public int[][] expressionZ(int n, int m) {
        int[][] matrix = new int[n][m];
        int count = 1;
        int i = n - 1;
        while (i >= 0) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = count++;
            }
            i--;
        }
        return matrix;
    }

    public int[][] expressionI(int n, int m) {
        int[][] matrix = new int[n][m];
        int count = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                matrix[i][j] = count++;
            }
        }
        return matrix;
    }

    public int[][] expressionK(int n, int m) {
        int[][] matrix = new int[n][m];
        int count = 1;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                matrix[j][i] = count++;
            }
        }
        return matrix;
    }

    public int[][] expressionL(int n, int m) {
        int[][] matrix = new int[n][m];
        int count = 1;
        for (int i = matrix.length - 1; i >= 0; i--) {
            if (i % 2 == 1) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = count++;
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    matrix[i][j] = count++;
                }
            }
        }
        return matrix;
    }

    public int[][] expressionM(int n, int m) {
        int[][] matrix = new int[n][m];
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = m - 1; j >= 0; j--) {
                    matrix[i][j] = count++;
                }
            } else {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = count++;
                }
            }
        }
        return matrix;
    }

    public int[][] expressionN(int n, int m) {
        int[][] matrix = new int[n][m];
        int count = 1;
        for (int i = matrix[0].length - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                for (int j = matrix.length - 1; j >= 0; j--) {
                    matrix[j][i] = count++;
                }
            } else {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = count++;
                }
            }
        }
        return matrix;
    }

    public int[][] expressionO(int n, int m) {
        int[][] matrix = new int[n][m];
        int count = 1;
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = n - 1; j >= 0; j--) {
                    matrix[j][i] = count++;
                }
            } else {
                for (int j = 0; j < n; j++) {
                    matrix[j][i] = count++;
                }
            }
        }
        return matrix;
    }


    public int[][] expressionP(int n, int m) {
        int[][] matrix = new int[n][m];
        int count = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = count++;
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    matrix[i][j] = count++;
                }
            }
        }
        return matrix;
    }

    public int[][] expressionR(int n, int m) {
        int[][] matrix = new int[n][m];
        int count = 1;
        for (int i = matrix[0].length - 1; i >= 0; i--) {
            if (i % 2 == 1) {
                for (int j = matrix.length - 1; j >= 0; j--) {
                    matrix[j][i] = count++;
                }
            } else {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = count++;
                }
            }
        }
        return matrix;
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
