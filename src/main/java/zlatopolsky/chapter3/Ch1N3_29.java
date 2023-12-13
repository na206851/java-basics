package java.zlatopolsky.chapter3;

public class Ch1N3_29 {

    public boolean expressionA(int x, int y) { return x % 2 == 0 && y % 2 == 0;
    }

    public boolean expressionB(int x, int y) { return x < 0 || y < 0;
    }

    public boolean expressionV(int x, int y) { return x == 0 || y == 0;
    }

    public boolean expressionG(int x, int y, int z) { return x < 0 && y < 0 && z < 0;
    }

    public boolean expressionD(int x, int y, int z) { return x %
        5 == 0 && (y % 5 != 0 && z % 5 != 0) || y % 5 == 0 && (x % 5 != 
        0 && z % 5 != 0) || z % 5 == 0 && (x % 5 != 0 && y % 5 != 0);
    }

    public boolean expressionE(int x, int y, int z) { return x >
        100 && (y < 100 && z < 100) || y > 100 && (x < 100 && z < 100) 
        || z > 100 && (x < 100 && y < 100);
    }
}
