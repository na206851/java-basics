package zlatopolsky.chapter4;

public class Ch1N4_106 {

    public String season(int month) {
        String season = "";
        if (month > 12) {
            month %= 12;
        }
        season = switch (month) {
            case 3, 4, 5 -> "spring";
            case 6, 7, 8 -> "summer";
            case 9, 10, 11 -> "autumn";
            default -> "winter";
        };
        return season;
    }
}