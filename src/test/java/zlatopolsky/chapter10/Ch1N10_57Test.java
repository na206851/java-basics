package java.zlatopolsky.chapter10;

class Ch1N10_57Test {
    public static void main(String[] args) {
        Ch1N10_57 test = new Ch1N10_57();
        String str = "radar isi radar";
        System.out.println(str.length());
        System.out.println(test.stringPartPalindrome("radar isi radar", 0, 15));
    }
}