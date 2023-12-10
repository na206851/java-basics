package zlatopolsky.chapter10;

public class Ch1N10_44 {

    public int digitalRoot(int x) {
        if (x < 10) {
            return x;
        }
        return digitalRoot(sumDigits(x));
    }

    public int sumDigits(int x) {
        if (x < 10) {
            return x;
        }
        return x % 10 + sumDigits(x / 10);
    }
}
