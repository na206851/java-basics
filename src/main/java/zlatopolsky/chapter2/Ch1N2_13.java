package java.zlatopolsky.chapter2;

public class Ch1N2_13 {
    public  int reverseNumber(int x) {
        return x % 10 * 100 + x % 100 / 10 * 10 + x / 100;
    }
}
