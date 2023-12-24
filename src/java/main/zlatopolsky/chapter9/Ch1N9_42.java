package zlatopolsky.chapter9;

public class Ch1N9_42 {

    public String reverseString(String str) {
        StringBuilder strReverse = new StringBuilder(str);
        return strReverse.reverse().toString();
    }
}
