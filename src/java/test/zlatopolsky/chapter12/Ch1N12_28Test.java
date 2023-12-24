package zlatopolsky.chapter12;

import static zlatopolsky.chapter12.Ch1N12_25.print;

class Ch1N12_28Test {
    public static void main(String[] args) {
        Ch1N12_28 test = new Ch1N12_28();

        print(test.spiralMatrix(6, 6));
        print(test.spiralMatrix(6, 5));
        print(test.spiralMatrix(2, 2));
        print(test.spiralMatrix(2, 3));
    }
}