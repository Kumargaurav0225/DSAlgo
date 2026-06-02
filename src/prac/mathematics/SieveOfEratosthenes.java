package prac.mathematics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 35;
        System.out.println(sieve(n));
    }

    private static List<Integer> sieve(int n) {
       List<Integer> primes = new ArrayList<>();

       boolean[] prime = new boolean[n+1];
       Arrays.fill(prime, true);

       for(int i = 2 ; i*i <=n; i++){
           if(prime[i]){
               for(int j = i*i ; j <=n; j += i)
                   prime[j] =false;
           }
       }

       for(int p = 2;p <= n;p++){
           if(prime[p])
               primes.add(p);
       }
       return primes;
    }
}
