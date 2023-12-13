package java.zlatopolsky.chapter10;

public class Ch1N10_44 {

    public int digitalRoot(int x) {
        if (x < 10) {
            return x;
        } else {
            int sum = 0;
            while (x > 0) {
                int digit = x % 10;
                sum += digit;
                x /= 10;
            }
            return digitalRoot(sum);
        }
    }
}
