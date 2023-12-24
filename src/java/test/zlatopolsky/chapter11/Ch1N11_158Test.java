package zlatopolsky.chapter11;

import java.util.Arrays;

class Ch1N11_158Test {
    public static void main(String[] args) {
        Ch1N11_158 test = new Ch1N11_158();
        int[] nums = new int[]{1, 1, 2, 2};
        System.out.println((Arrays.toString(test.removeDuplicates(nums))));
        System.out.println((test.removeDuplicates2(nums)));
    }
}