package zlatopolsky.chapter12;

import java.util.Random;

public class Ch1N12_63 {

    public int[][] numberOfStudents(int[][] arr) {
        Random children = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = children.nextInt(30 - 15) + 15;
            }
        }
        return arr;
    }
    public int[] columnAverage(int[][] arr) {
        int[] result = new int[arr.length];
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                tmp += arr[i][j];
            }
            result[i] = tmp / arr[0].length;
            tmp = 0;
        }
        return result;
    }
}
