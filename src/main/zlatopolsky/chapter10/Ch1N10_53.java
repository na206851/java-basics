package zlatopolsky.chapter10;

import java.util.Scanner;

public class Ch1N10_53 {

    public void reverseRow(Scanner sc) {
        int number = sc.nextInt();
        if (number != 0) {
            reverseRow(sc);
            System.out.println(number);
        }
    }
}
