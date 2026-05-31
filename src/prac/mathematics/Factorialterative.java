package prac.mathematics;

public class Factorialterative {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(0));
    }

    private static int factorial(int num) {
        int res  = 1;
        for (int n = 2; n <= num; n++) {
            res = res * n;
        }
        return res;
    }
}
