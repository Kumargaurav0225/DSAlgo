package prac.mathematics;

import java.util.ArrayList;
import java.util.List;

public class AllFactorsOfANumOptimizedSorted {

    public static void main(String[] args) {
        int num = 10;
        System.out.println(printDivisors(num));
    }

    private static List<Integer> printDivisors(int num) {
        List<Integer> divisors = new ArrayList<>();
        int i;
        for( i = 1; i < Math.sqrt(num); i++) {
            if(num % i == 0) {
                divisors.add(i);
            }
        }
        while(i >= 1){
            if(num % i == 0)
                divisors.add(num / i);
            i--;
        }
        return  divisors;
    }
}
