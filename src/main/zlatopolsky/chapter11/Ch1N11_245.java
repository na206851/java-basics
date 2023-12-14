package zlatopolsky.chapter11;

public class Ch1N11_245 {

    public int[] sortAndCopyArray(int nums[]) {
        int[] result = new int[nums.length];
        int index = 0;
        int lastIndex = result.length - 1;
        for (int i = 0; i < result.length; i++) {
            if (nums[i] >= 0) {
                result[lastIndex] = nums[i];
                lastIndex--;
            } else if (nums[i] <= 0) {
                result[index] = nums[i];
                index++;
            }
        }
        return result;
    }
}
