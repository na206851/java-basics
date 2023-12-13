package java.zlatopolsky.chapter5;

public class Ch1N5_38 {

    public double strangeHusbandCommonPath(int countReverse) {
        double goHome = 0;
        double goWork = 0;
        for (double i = 1; i < countReverse + 1; i++) {
            if (i % 2 != 0) {
                goWork += 1 / i;
            }
            if (i % 2 == 0) {
                goHome += 1 / i;
            }
        }
        return (goWork + goHome) * 1000;
    }

    public double strangeHusbandDistanceFromHome(int countReverse) {
        double goHome = 0;
        double goWork = 0;
        for (double i = 1; i < countReverse + 1; i++) {
            if (i % 2 != 0) {
                goWork += 1 / i;
            }
            if (i % 2 == 0) {
                goHome += 1 / i;
            }
        }
        return (goWork - goHome) * 1000;
    }
}