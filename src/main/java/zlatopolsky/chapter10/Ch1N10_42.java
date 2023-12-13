package java.zlatopolsky.chapter10;

public class Ch1N10_42 {

    public int digitsSquare(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * digitsSquare(x, (n - 1));
    }
}
