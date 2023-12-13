package zlatopolsky.chapter6;

import java.util.Random;

class Ch1N6_87Test {
    public static void main(String[] args) {
        Ch1N6_87 test = new Ch1N6_87();
        Random countBall = new Random();
        int x = countBall.nextInt(10 - 9) + 9;
        System.out.println(test.gameBasketball(x));
    }
}