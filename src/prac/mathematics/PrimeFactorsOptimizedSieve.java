package prac.mathematics;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsOptimizedSieve {
    public static void main(String[] args) {
        int n = 20;
        List<Integer> primeFactors = primeFactors(n);
        System.out.println("Prime factors of " + n + " are: " + primeFactors);
    }

    private static List<Integer> primeFactors(int n) {
        List<Integer> primeFactors = new ArrayList<>();

        if( n <= 1) return primeFactors;

        while(n % 2 == 0){
            primeFactors.add(2);
            n /= 2;
        }

        while(n % 3 == 0){
            primeFactors.add(3);
            n /= 3;
        }

        for(int i =5; i<= n; i+=6){
            while(n % i == 0){
                primeFactors.add(i);
                n /= i;
            }

            while(n % (i+2) == 0){
                primeFactors.add((i+2));
                n /= (i+2);
            }
        }
        if(n>3)
            primeFactors.add(n);
        return primeFactors;
    }
}
