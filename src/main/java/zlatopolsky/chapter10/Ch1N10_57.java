package java.zlatopolsky.chapter10;

public class Ch1N10_57 {

    public boolean stringPartPalindrome(String initStr, int first, int last) {
        if (initStr.length() <= 1) {
            return true;
        } else {
            char firstElement = initStr.charAt(0);
            char lastElement = initStr.charAt(initStr.length() - 1);
            if (firstElement == lastElement) {
                String secondStr = initStr.substring(first, last);
                return stringPartPalindrome(secondStr, 1, secondStr.length() - 1);
            }
            return false;
        }
    }
}
