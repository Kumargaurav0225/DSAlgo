package prac.recursion;

public class CuttingRopeIntoNPieces {

    public static void main(String[] args) {
        int n = 5, a = 2, b = 1, c = 5;
        System.out.println(maxCuts(n, a, b, c));

        int m = 23, x = 12, y = 11, z = 9;
        System.out.println(maxCuts(m, x, y, z));
    }

    private static int maxCuts(int n, int a, int b, int c) {

        if (n == 0) return 0;
        if (n <= -1) return -1;

        int res = Math.max(maxCuts(n - a, a, b, c),
                Math.max(maxCuts(n - b, a, b, c), maxCuts(n - c, a, b, c)
                )
        );

        if (res == -1) return -1;
        return res + 1;
    }
}
