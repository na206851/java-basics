package zlatopolsky.chapter10;

import java.util.Scanner;

public class Ch1N10_53 {

    /**
     * this method returns the reverse sequence of numbers until zero is entered
     */
    public void reserseSequenceOfNumber(Scanner sc) {
        int number = sc.nextInt();
        if (number != 0) {
            reserseSequenceOfNumber(sc);
            System.out.println(number);
        }
    }
}
