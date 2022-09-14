package prac.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(digitSum(103));
    }

    private static int digitSum(int n) {
        if (n <= 9) return n;
        return n % 10 + digitSum(n / 10);
    }
}
