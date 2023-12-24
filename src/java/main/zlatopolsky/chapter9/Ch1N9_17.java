package zlatopolsky.chapter9;

public class Ch1N9_17 {

    public boolean firstAndLastLetter(String str) {
        str = str.toLowerCase();
        return str.charAt(0) == str.charAt(str.length() - 1);
    }
}
