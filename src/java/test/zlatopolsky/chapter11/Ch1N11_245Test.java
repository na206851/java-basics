package zlatopolsky.chapter11;

import java.util.Arrays;

class Ch1N11_245Test {
    public static void main(String[] args) {
        Ch1N11_245 test = new Ch1N11_245();
        int[] nums = new int[]{1, 2, 3, -1, -2, -3, 4, 5, 0, -9, 8};
        System.out.println(Arrays.toString(test.sortAndCopyArray(nums)));
    }
}