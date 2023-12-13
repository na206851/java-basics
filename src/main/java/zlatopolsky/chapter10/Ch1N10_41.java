package java.zlatopolsky.chapter10;

public class Ch1N10_41 {

    public int factorialRecursion(int x) {
        if (x == 1) {
            return x;
        }
        return factorialRecursion(x - 1) * x;
    }
}

