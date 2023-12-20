package zlatopolsky.chapter6;

public class Ch1N6_8 {

    public int[] arrayDigits(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i * i;
        }
        return array;
    }

    public int[] digitsLessTarget(int[] array, int target) {
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < target) {
                count++;
            }
        }
        int[] result = new int[count];
        int indexResultArr = 0;
        while (indexResultArr < count && array[indexResultArr] < target) {
            result[indexResultArr] = array[indexResultArr];
            indexResultArr++;
        }
        return result;
    }
}
