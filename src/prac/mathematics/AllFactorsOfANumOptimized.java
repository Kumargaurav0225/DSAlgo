package prac.mathematics;

import java.util.ArrayList;
import java.util.List;

public class AllFactorsOfANumOptimized {

    public static void main(String[] args) {
        int num = 10;
        System.out.println(printDivisors(num));
    }

    private static List<Integer> printDivisors(int num) {
        List<Integer> divisors = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                if(num / i == i){
                    divisors.add(i);
                }else{
                    divisors.add(i);
                    divisors.add(num / i);
                }
            }
        }
        return  divisors;
    }
}
