package zlatopolsky.chapter10;

import java.util.ArrayList;

class Ch1N10_55Test {
    public static void main(String[] args) {
        Ch1N10_55 test = new Ch1N10_55();
        ArrayList<Integer> list10to3 = new ArrayList<>();
        System.out.println(test.transformation(0, 16, list10to3).toString());
        System.out.println(test.transformation(16, 16, list10to3).toString());
        System.out.println(test.transformation(15, 16, list10to3).toString());
    }
}