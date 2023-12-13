package java.zlatopolsky.chapter4;

public class Ch1N4_15 {

    public int humanAge(int yearOfBirth, int monthOfBirth, int yearCurrent, int monthCurrent) {
        return ((yearCurrent * 12 +
                monthCurrent) - (yearOfBirth * 12 + monthOfBirth)) / 12;
    }
}
