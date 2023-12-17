package zlatopolsky.chapter10;

public class Ch1N10_48 {

    public int maxElementInArray(int[] nums) {
        return maxElementInArray(nums, 0);
    }

    public int maxElementInArray(int[] nums, int index) {
        if (index == nums.length - 1) {
            return index;
        } else {
            int maxIndex = maxElementInArray(nums, index + 1);
            if (nums[index] > nums[maxIndex]) {
                return index;
            } else {
                return maxIndex;
            }
        }
    }
}
