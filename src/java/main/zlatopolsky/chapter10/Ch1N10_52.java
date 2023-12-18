package zlatopolsky.chapter10;

public class Ch1N10_52 {

    public int reverseNumber(int number, int reverse) {
        if (number == 0) {
            return reverse;
        }

        reverse = (reverse * 10) + (number % 10);
        return reverseNumber(number / 10, reverse);
    }
}
