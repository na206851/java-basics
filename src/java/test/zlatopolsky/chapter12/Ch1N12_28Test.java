package zlatopolsky.chapter12;

import static zlatopolsky.chapter12.Ch1N12_263.printMatrix;

class Ch1N12_28Test {
    public static void main(String[] args) {
        Ch1N12_28 test = new Ch1N12_28();

        printMatrix(test.spiralMatrix(6, 6));
        printMatrix(test.spiralMatrix(6, 5));
        printMatrix(test.spiralMatrix(2, 2));
        printMatrix(test.spiralMatrix(2, 3));
    }
}