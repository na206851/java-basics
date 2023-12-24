package zlatopolsky.chapter10;

public class Ch1N10_50 {

    public int functionAccerman(int n, int m) {
        if (n == 0) {
            return m + 1;
        } else if (n != 0 && m == 0) {
            return functionAccerman(n - 1, 1);
        } else if (n > 0 && m > 0) {
            return functionAccerman(n - 1, functionAccerman(n, m - 1));
        } else {
            return 0;
        }
    }
}
