package prac.mathematics;

import java.util.ArrayList;
import java.util.List;

public class AllFactorsOfANumNaive {

    public static void main(String[] args) {
        int num = 10;
        System.out.println(printDivisors(num));
    }

    private static List<Integer> printDivisors(int num) {
        List<Integer> divisors = new ArrayList<>();
        for(int i=1;i<=num;i++){
            if(num % i == 0)
                divisors.add(i);
        }
        return divisors;
    }
}
