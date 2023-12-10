package zlatopolsky.chapter4;

public class Ch1N4_115 {

    public String eastCalendar(int year) {
        String[] animal = {"rat", "cow", "tiger", "hare", "dragon", "snake", "horse", "sheep", "monkey", "rooster", "dog", "pig"};
        String[] element = {"metal", "water", "tree", "fire", "earth"};

        int cycleAnimal = (year % 60) % 12 - 4;
        int cycleElement = year % 10;
        int indexElement = 0;
        switch (cycleElement) {
            case 0, 1:
                indexElement = 0;
                break;
            case 2, 3:
                indexElement = 1;
                break;
            case 4, 5:
                indexElement = 2;
                break;
            case 6, 7:
                indexElement = 3;
                break;
            case 8, 9:
                indexElement = 4;
                break;
        }
        return animal[cycleAnimal] + " " + element[indexElement];
    }
}