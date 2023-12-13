package java.zlatopolsky.chapter10;

public class Ch1N10_50 {

    public int accerman(int n, int m) {
        if (n == 0) {
            return m + 1;
        } else if (n != 0 && m == 0) {
            return accerman(n - 1, 1);
        } else if (n > 0 && m > 0) {
            return accerman(n - 1, accerman(n, m - 1));
        } else {
            return 0;
        }
    }
}
