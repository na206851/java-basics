package zlatopolsky.chapter10;

import java.util.ArrayList;

public class Ch1N10_54 {

    public int reverseArrayList(ArrayList list10to2) {
        int i = list10to2.size();
        StringBuilder number = new StringBuilder();
        while (i > 0) {
            number.append(list10to2.get(i - 1));
            i--;
        }
        return Integer.parseInt(number.toString());
    }
    public ArrayList translation10to2(int n, ArrayList list10to2) {
        if (n == 0) {
            list10to2.add(0);
            return list10to2;
        } else if (n == 1) {
            list10to2.add(1);
            return list10to2;
        } else {
            list10to2.add(n % 2);
            return (translation10to2(n / 2, list10to2));
        }
    }
}
