package java.zlatopolsky.chapter2;

public class Ch1N2_39 {
    public int TimeToDegrees(int hour, int min) {
        if (hour > 12) {
            hour %= 12;
        }
        min = hour * 60 + min;
        return min * 360 / 720;
    }
}
