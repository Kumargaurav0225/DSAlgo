package prac.mathematics;

public class TrailingZeroesInFactorialOptimized {

    public static void main(String[] args) {
        int n = 251;
        System.out.println(trailingZeroes(n));
    }

    public static int trailingZeroes(int num) {
        if(num < 0) {
            return -1;
        }
        int count = 0;
        for(int i = 5; i <= num; i *= 5){
            count  = count + num / i;
        }
        return count;
    }
}
