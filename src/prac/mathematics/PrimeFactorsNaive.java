package prac.mathematics;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsNaive {
    public static void main(String[] args) {
        int n = 18;
        List<Integer> primeFactors = primeFactors(n);
        System.out.println("Prime factors of " + n + " are: " + primeFactors);
    }

    private static List<Integer> primeFactors(int n) {
        List<Integer> primeFactors = new ArrayList<>();

        for(int i =2; i <= n; i++){
            while( n % i == 0 && n > 0){
                primeFactors.add(i);
                n = n/i;
            }
        }
        return primeFactors;
    }
}
