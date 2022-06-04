package prac.observations.slidingwindow.easy;

import java.util.ArrayList;
import java.util.List;

public class FindingAvgOfKSubArrays {
    public static void main(String[] args) {
        int[] i ={1, 3, 2, 6, -1, 4, 1, 8, 2};

        List<Double> ls = findAvgOfSubArraysBruteForce(i,5);
        System.out.println(ls.toString());

        double[] res = findAverageofSubArrays(i,5);
        for (int j = 0; j < res.length; j++) {
            System.out.print(res[j]+" ");
        }
    }

    public static List<Double> findAvgOfSubArraysBruteForce(int[] arr, int k){
        List<Double> res = new ArrayList<>();
        for (int i = 0; i < arr.length-k+1; i++) {
            double sum =0;
            for (int j = i; j < i+k; j++) {
                sum +=arr[j];
            }
            res.add(sum / k);
        }
        return res;
    }

    public static double[] findAverageofSubArrays(int[] arr,int k){
        double[] res = new double[arr.length-k+1];
        double windowSum = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
            if (windowEnd >= k-1){
                res[windowStart]=windowSum/k;
                windowSum -= windowSum-arr[windowStart];
                windowStart++;
            }
        }
        return res;
    }
}
