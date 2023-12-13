package java.zlatopolsky.chapter2;

public class Ch1N2_31 {
    public int reverseTwoDigit(int n) {
        int a = n / 100;
        int b = n % 10;
        int c = n % 100 / 10;
        int result = a * 100 + b * 10 + c;
        return result;
    }
}
