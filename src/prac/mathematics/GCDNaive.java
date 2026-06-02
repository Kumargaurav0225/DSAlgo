package prac.mathematics;

public class GCDNaive {
    public static void main(String[] args) {
        int a = 20, b = 28;
        System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if(a == 0 || b == 0) return Math.max(a, b);

        int res = Math.max(a, b);
        while(res > 0){
            if(a % res == 0 && b % res == 0)
                return res;
            res --;
        }
        return res;
    }
}
