package zlatopolsky.chapter10;

public class Ch1N10_43 {

    public int sumDigits(int x) {
        if (x <= 0) {
            return x;
        }
        return x % 10 + (sumDigits(x / 10));
    }

    public int countDigits(int x) {
        if (x <= 10) {
            return 1;
        }
        return 1 + countDigits(x / 10);
    }
}