package zlatopolsky.chapter10;

public class Ch1N10_52 {

    public int reverseNumber(int n) {
        if (n < 10) {
            return n;
        } else {
            return Integer.parseInt(String.valueOf(n % 10) + reverseNumber(n / 10));
        }
    }
}
