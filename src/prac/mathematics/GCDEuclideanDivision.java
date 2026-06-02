package prac.mathematics;

public class GCDEuclideanDivision {

    public static void main(String[] args) {
        int a = 20, b = 28;
        System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
    }

    public static int gcd(int a, int b){
        return (b == 0) ? a : gcd(b, a % b);
    }
}
