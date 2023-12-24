package zlatopolsky.chapter10;

import java.util.ArrayList;
import java.util.List;

public class Ch1N10_54 {

    public List<Integer> translation10to2(int n) {
        List<Integer> list10to2 = new ArrayList<>();
        if (n == 1 || n == 0) {
            list10to2.add(0, n);
            return list10to2;
        }
        return translation10to2(n, list10to2);
    }

    public List<Integer> translation10to2(int n, List<Integer> list10to2) {
        if (n == 0) {
            return list10to2;
        } else if (n == 1) {
            list10to2.add(0, 1);
            return list10to2;
        } else {
            list10to2.add(0, n % 2);
            return translation10to2(n / 2, list10to2);
        }
    }
}
