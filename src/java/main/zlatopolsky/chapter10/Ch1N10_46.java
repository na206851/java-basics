package zlatopolsky.chapter10;

public class Ch1N10_46 {

    public int NMemberOfGeometriсProgression(int firstMember, int denominater, int n) {
        if (n == 1) {
            return firstMember;
        } else {
            return denominater * NMemberOfGeometriсProgression(firstMember, denominater, n - 1);
        }
    }

    public int sumNMemberOfGeometricProgression(int firstMember, int denominater, int n) {
        if (n == 1) {
            return firstMember;
        } else {
            return firstMember + (denominater * sumNMemberOfGeometricProgression(firstMember, denominater, n - 1));
        }
    }
}
