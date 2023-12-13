package java.zlatopolsky.chapter4;

public class Ch1N4_33 {
    public boolean lastNumberEvenOrNot(int x) {
        return (x % 10) % 2 == 0;
    }

    public boolean lastNumberOddOrNot(int x) {
        return (x % 10) % 2 != 0;
    }
}
