package zlatopolsky.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ch1N11_158 {

    public int[] removeDuplicates(int[] nums2) {
        return Arrays.stream(nums2).distinct().toArray();
    }

    public List<Integer> removeDuplicates2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int index = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    nums[index] = nums[i];
                } else {
                    nums[index] = 0;
                }
            }
            index++;
        }

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != 0) {
                list.add(nums[k]);
            }
        }

        if (count == 1) {
            list.add(0);
        }
        return list;
    }
}
