package zlatopolsky.chapter9;

public class Ch1N9_185 {

    public int validPairs(String str) {
        char[] arr = str.toCharArray();
        int count = 0;
        char prev = ' ';
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                count++;
            } else {
                count--;
            }
            prev = arr[i];
        }
        return count;
    }
}
