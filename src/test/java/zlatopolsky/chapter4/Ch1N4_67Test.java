package java.zlatopolsky.chapter4;

class Ch1N4_67Test {
    public static void main(String[] args) {
        Ch1N4_67 test = new Ch1N4_67();
        for (int i = 0; i < 7; i++) {
            System.out.println(test.weekendOrWorkday(i) + " " + i);
        }
    }
}