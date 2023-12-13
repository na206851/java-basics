package java.zlatopolsky.chapter10;

public class Ch1N10_51 {

    public void recursionExpressionA(int n) {
        if (n > 0) {
            System.out.println(n);
            recursionExpressionA(n - 1);
        }
    }

    public void recursionExpressionB(int n) {
        if (n > 0) {
            System.out.println(n);
            recursionExpressionB(n - 2);
        }
    }

    public void recursionExpressionC(int n) {
        if (n > 0) {
            System.out.println(n);
            recursionExpressionC(n - 1);
        }
        System.out.println(n);
    }
}
