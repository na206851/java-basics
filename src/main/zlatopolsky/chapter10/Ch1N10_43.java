package zlatopolsky.chapter10;

public class Ch1N10_43 {

    public static int sumDigits(int x) {
        if (x <= 0) {
            return x;
        }
        return x % 10 + (sumDigits(x / 10));
    }

    public static int sumDigits(int x, int count) {
        if (x <= 0) {
            return x;
        }
        return x % 10 + sumDigits(x / 10);
    }
}