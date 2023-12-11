package zlatopolsky.chapter4;

public class Ch1N4_67 {

    public String weekendOrWorkday(int k) {
        return k % 7 > 5 ||
                k % 7 == 0 ? "weekend" : "workday";
    }
}
