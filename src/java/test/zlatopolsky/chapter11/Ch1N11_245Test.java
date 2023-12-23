package zlatopolsky.chapter11;

import java.util.Arrays;

class Ch1N11_245Test {
    public static void main(String[] args) {
        Ch1N11_245 test = new Ch1N11_245();
        int[] nums = new int[]{1, 2, 3, -1, -2, -3, 0, 8};
        int[] nums1 = new int[]{-1, -2, 1, 2, -1};

        System.out.println(Arrays.toString(test.sortAndCopyArray(nums)));
        System.out.println(Arrays.toString(test.sortAndCopyArray(nums1)));
    }
}