package zlatopolsky.chapter6;

import java.util.ArrayList;
import java.util.Random;

public class Ch1N6_87 {

    public String gameBasketball(int x) {
        Random team1 = new Random();
        Random team2 = new Random();
        String result = "";
        int a = 0;
        int b = 0;
        ArrayList<Integer> checkTeam1 = new ArrayList<>();
        ArrayList<Integer> checkTeam2 = new ArrayList<>();
        while (x > 0) {
            a += team1.nextInt(3 - 1) + 1;
            b += team2.nextInt((3 - 1) + 1);
            checkTeam1.add(a);
            checkTeam2.add(b);
            x--;
        }

        if (checkTeam1.get(checkTeam1.size() - 1) > checkTeam2.get(checkTeam2.size() - 1)) {
            result = "first team win";
        } else if (checkTeam1.get(checkTeam1.size() - 1) == checkTeam2.get(checkTeam2.size() - 1)) {
            result = "ничья";
        } else {
            result = "second team win";
        }
        return result;
    }
}
