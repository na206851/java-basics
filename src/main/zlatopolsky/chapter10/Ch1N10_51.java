package zlatopolsky.chapter10;

public class Ch1N10_51 {

    public int recursionExpressionA(int n) {
        if (n > 0) {
            return n;
        }
        return recursionExpressionA(n - 1);
    }

    public int recursionExpressionB(int n) {
        if (n > 0) {
            recursionExpressionB(n - 2);
            return n;
        }
        return n;
    }

    public int recursionExpressionC(int n) {
        if (n > 0) {
            return n;
        }
        return recursionExpressionC(n - 1);

    }
}
