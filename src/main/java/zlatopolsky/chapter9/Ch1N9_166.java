package java.zlatopolsky.chapter9;

public class Ch1N9_166 {

    public String firstAndLastWordReplace(String str) {
        String[] arr = str.split(" ");
        if (arr.length == 1) {
            return str;
        }
        int first = 0;
        int last = arr.length - 1;
        String tmp = arr[first];
        arr[first] = arr[last];
        arr[last] = tmp;
        tmp = "";
        int i = 0;
        while (i < arr.length) {
            tmp += arr[i] + " ";
            i++;
        }
        return tmp.trim();
    }
}
