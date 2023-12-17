package zlatopolsky.chapter1;

public class Ch1N1_17 {

    public double expressionO(int x) {
        return Math.sqrt(1 - (Math.sin(x) * Math.sin(x)));
    }

    public double expressionP(int a, int b, int c, int x) {
        return 1 / (Math.sqrt(a * Math.pow(x, 2) + b * x + c));
    }

    public double expressionR(int x) {
        return (Math.sqrt(x + 1) + Math.sqrt(x - 1)) / (2 * Math.sqrt(x));
    }

    public double expressionS(int x) {
        return Math.abs(x) + Math.abs(x + 1);
    }
}
