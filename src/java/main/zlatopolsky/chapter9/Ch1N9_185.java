package zlatopolsky.chapter9;

public class Ch1N9_185 {

    public boolean validPairs(String str) {
        char[] arr = str.toCharArray();
        int openBraces = 0;
        int closeBraces = 0;
        if (arr.length == 1 || arr[0] == ')') {
            return false;
        }
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == '(') {
                openBraces++;
            } else {
                closeBraces++;
            }
            if (closeBraces > openBraces) {
                return false;
            }
        }
        return openBraces - closeBraces == 0;
    }
}