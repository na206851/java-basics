package java.zlatopolsky.chapter12;

import java.util.Arrays;

class Ch1N12_63Test {
    public static void main(String[] args) {
        Ch1N12_63 test = new Ch1N12_63();
        int parallel = 4;
        int numberClass = 11;
        int[][] arr = new int[numberClass][parallel];
        System.out.println(Arrays.toString(test.columnAverage(test.numberOfStudents(arr))));
    }
}