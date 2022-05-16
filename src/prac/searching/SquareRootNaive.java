package prac.searching;

public class SquareRootNaive {
    public static void main(String[] args) {
        System.out.println(sqRootFloor(17));
    }

    private static int sqRootFloor(int x) {
        int i=1;
        while (i*i <= x)
            i++;

        return i-1;
    }
}
