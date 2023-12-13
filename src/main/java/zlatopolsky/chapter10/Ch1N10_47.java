package zlatopolsky.chapter10;

public class Ch1N10_47 {

    public int seriesFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return seriesFibonacci(n - 2) + seriesFibonacci(n - 1);
    }
}