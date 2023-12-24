package zlatopolsky.chapter6;

import java.util.Arrays;

class Ch1N6_8Test {
    public static void main(String[] args) {
        Ch1N6_8 test = new Ch1N6_8();
        System.out.println(Arrays.toString(test.arrayDigits(5)));
        System.out.println(Arrays.toString(test.digitsLessTarget(test.arrayDigits(5), 15)));
    }
}