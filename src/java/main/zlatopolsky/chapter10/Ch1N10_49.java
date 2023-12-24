package zlatopolsky.chapter10;

public class Ch1N10_49 {

    public int maxElement(int[] nums) {
        return maxElement(nums, 0);
    }

    public int maxElement(int[] nums, int index) {
        if (index == nums.length - 1) {
            return nums[index];
        } else {
            int max = maxElement(nums, index + 1);
            if (nums[index] > max) {
                return nums[index];
            } else {
                return max;
            }
        }
    }
}
