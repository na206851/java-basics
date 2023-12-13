package zlatopolsky.chapter12;

class Ch1N12_263Test {
    public static void main(String[] args) {
        Ch1N12_263 test = new Ch1N12_263();
        System.out.println("row deletion");
        int[][] matrix = test.fillingTheArray(3, 3);
        test.printMatrix(matrix);
        System.out.println();
        test.printMatrix(test.deletingTheLine(matrix, 1));

        System.out.println("column deletion");
        int[][] matrix1 = test.fillingTheArray(3, 3);
        test.printMatrix(matrix1);
        System.out.println();
        test.printMatrix(test.deletingTheColon(matrix1, 1));
    }
}