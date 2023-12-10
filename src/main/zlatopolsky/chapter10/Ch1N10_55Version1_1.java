package zlatopolsky.chapter10;

import java.util.ArrayList;

public class Ch1N10_55Version1_1 {

    public ArrayList<String> transformation(int number, int nSystem, ArrayList<String> list) {
        String[] system = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        if (number == 0 && !list.isEmpty()) {
            return list;
        }

        if (number < nSystem) {
            list.add(0, system[number]);
            return list;
        } else {
            list.add(0, system[number % nSystem]);
            return transformation(number / nSystem, nSystem, list);
        }
    }
}
