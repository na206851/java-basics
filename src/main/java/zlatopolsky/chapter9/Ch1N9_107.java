package java.zlatopolsky.chapter9;

public class Ch1N9_107 {

    public String inputLetter(String str) {
        int firstA = str.indexOf("a");
        int lastO = str.lastIndexOf("o");
        String text = "error, one or two digits missing";
        if (firstA != -1 && lastO != -1) {
            char[] arrWord = str.toCharArray();
            arrWord[firstA] = 'o';
            arrWord[lastO] = 'a';
            String result = new String(arrWord);
            return result;
        }
        return text;
    }
}
