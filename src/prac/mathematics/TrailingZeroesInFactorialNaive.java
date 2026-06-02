package prac.mathematics;

public class TrailingZeroesInFactorialNaive {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(trailingZeroes(n));
    }

    private static int trailingZeroes(int num){
        int fact = fact(num);
        int count = 0;

        while(fact % 10 == 0){
            count++;
            fact /= 10;
        }

        return count;
    }

    private static int fact(int num) {
        int res = 1;
        for(int i = 2; i <= num; i++) {
            res *= i;
        }
        return res;
    }
}
