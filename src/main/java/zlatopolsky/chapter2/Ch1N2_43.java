package zlatopolsky.chapter2;

public class Ch1N2_43 {

    public int aDivisionB_Or_b_DivisionA(int a, int b) {
        return (a % b == 0 || b % a == 0) ? 1 : 0;
    }
}
