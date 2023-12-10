package zlatopolsky.chapter10;

import java.util.ArrayList;

public class Ch1N10_55 {

    public void init(int whatToConvert, int whereToConvert) {
        ArrayList<Integer> list10to2 = new ArrayList<>();
        ArrayList<Integer> list10to3 = new ArrayList<>();
        ArrayList<Integer> list10to8 = new ArrayList<>();
        ArrayList<Integer> list10to16 = new ArrayList<>();

        switch (whereToConvert) {
            case 2:
                System.out.println((tenToTwo(whatToConvert, list10to2)));
                break;
            case 3:
                System.out.println(reverse(tenToThree(whatToConvert, list10to3)));
                break;
            case 8:
                System.out.println(reverse(tenToEight(whatToConvert, list10to8)));
                break;
            case 16:
                System.out.println(reverse(tenToSixteen(whatToConvert, list10to16)));
                break;
            default:
                System.out.println("error, you wrong write whereToConvert");
        }
    }

    public String reverse(ArrayList reverseList) {
        int i = reverseList.size();
        StringBuilder number = new StringBuilder();
        while (i > 0) {
            number.append(reverseList.get(i - 1));
            i--;
        }
        return number.toString();
    }

    public ArrayList tenToTwo(int number, ArrayList list10to2) {
        if (number == 0) {
            list10to2.add(number);
            return list10to2;
        } else {
            list10to2.add(number % 2);
            return (tenToTwo(number / 2, list10to2));
        }
    }

    public ArrayList tenToThree(int number, ArrayList list10to3) {
        if (number < 3) {
            list10to3.add(number);
            return list10to3;
        } else {
            list10to3.add(number % 3);
            return tenToThree(number / 3, list10to3);
        }
    }

    public ArrayList tenToEight(int number, ArrayList list10to8) {
        if (number < 8) {
            list10to8.add(number);
            return list10to8;
        } else {
            list10to8.add(number % 8);
            return tenToEight(number / 8, list10to8);
        }
    }

    public ArrayList tenToSixteen(int number, ArrayList list10to16) {
        String[] sexteenSystem = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "F"};
        if (number < 16) {
            list10to16.add(sexteenSystem[number - 1]);
            return list10to16;
        } else {
            list10to16.add(sexteenSystem[number % 16]);
            return tenToSixteen(number / 16, list10to16);
        }
    }

    public ArrayList transformation(int number, int nSystem, ArrayList list) {
        String[] sixteenSystem = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        if (number < nSystem) {
            list.add(0, sixteenSystem[number]);
        } else {
            list.add(0, sixteenSystem[number % nSystem]);
            return transformation(number / nSystem, nSystem, list);
        }
        return list;
    }
}