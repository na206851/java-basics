package zlatopolsky.chapter10;

public class Ch1N10_45 {

    public int NMemberOfProgression(int first, int division, int n) {
        if (n == 1) {
            return first;
        } else {
            return NMemberOfProgression(first + division, division, n - 1);
        }
    }

    public int sumNMemberOfRecursion(int first, int division, int n) {
        if (n == 1) {
            return first;
        } else {
            return first + sumNMemberOfRecursion(first + division, division, n - 1);
        }
    }
}