package java.zlatopolsky.chapter11;

import java.util.Arrays;

class Ch1N11_158Test {
    public static void main(String[] args) {
        Ch1N11_158 test = new Ch1N11_158();
        int[] nums = new int[]{1, 1, 2, 2, 3, 3, 4, 5, 0, 5, 5, 3, 4, 9};
        System.out.println((Arrays.toString(test.removeDuplicate(nums))));
        System.out.println((test.removeDuplicate2(nums)));
    }
}