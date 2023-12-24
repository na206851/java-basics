package zlatopolsky.chapter10;

import java.util.Scanner;

public class Ch1N10_53 {

    public void reverseSequenceOfNumber(Scanner sc) {
        int number = sc.nextInt();
        if (number != 0) {
            reverseSequenceOfNumber(sc);
            System.out.println(number);
        }
    }
}
