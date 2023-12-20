package zlatopolsky.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ch1N11_158 {

    public int[] removeDuplicate(int[] nums2) {
        return Arrays.stream(nums2).distinct().toArray();
    }

    public List<Integer> removeDuplicate2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int index = 0;
        int count = 0;
        int a = 0;
        while (a < nums.length) {
            if (nums[a] == 0) {
                count++;
            }
            a++;
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
        index = 0;

        while (index < nums.length) {
            if (nums[index] != 0) {
                list.add(nums[index]);
            }
            index++;
        }

        if (count == 1) {
            list.add(0);
        }
        System.out.println(list);
        return list;
    }
}
