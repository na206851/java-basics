package zlatopolsky.chapter3;

public class Ch1N3_26 {

    public static boolean expressionA(boolean x, boolean y, boolean z) {
        return !(x || y) && (!x || !y);
    }

    public static boolean expressionB(boolean x, boolean y, boolean z) {
        return !(!x && y) || (x && !z);
    }

    public static boolean expressionC(boolean x, boolean y, boolean z) {
        return x || !y && !(x || !z);
    }
}

