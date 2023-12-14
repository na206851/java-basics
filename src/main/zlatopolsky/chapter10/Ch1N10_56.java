package zlatopolsky.chapter10;

public class Ch1N10_56 {

    public boolean palindromeString(String str) {
        if (str.length() <= 1) {
            return true;
        } else {
            char i = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            if (i == last) {
                String word = str.substring(1, str.length() - 1);
                return palindromeString(word);
            } else {
                return false;
            }
        }
    }
}
