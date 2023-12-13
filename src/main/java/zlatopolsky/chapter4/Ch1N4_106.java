package zlatopolsky.chapter4;

public class Ch1N4_106 {

    public String season(int month) {
        String season = "";
        if (month > 12) {
            month %= 12;
        }
        switch (month) {
            case 3, 4, 5:
                season = "spring";
                break;
            case 6, 7, 8:
                season = "summer";
                break;
            case 9, 10, 11:
                season = "autumn";
                break;
            default:
                season = "winter";
        }
        return season;
    }
}