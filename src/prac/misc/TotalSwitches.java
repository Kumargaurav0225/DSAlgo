package prac.misc;

import java.util.HashMap;

public class TotalSwitches {
    public static void main(String[] args) {
        int[] a ={15,32,34};
        int[] b = {25,43};

        int n1 = a.length;
        int n2 = b.length;
        System.out.println(mergeArrays(a, b,n1,n2));
    }

    public static int mergeArrays(int[] arr1, int[] arr2, int n1, int n2) {
        int i = 0, j = 0;
        int context =0;
        String curr ="",tracker="";
        HashMap<String,String> mp = new HashMap<>();
        // Traverse both array
        while (i<n1 && j <n2)
        {
            if (arr1[i] < arr2[j]) {
                curr = "a";
                if (mp.get(tracker) == null) {
                    mp.put(tracker, curr);
                } else if (!mp.get(tracker).equalsIgnoreCase(curr)) {
                    mp.put(tracker, curr);
                    context++;
                }
                i++;
            }else{
                curr="b";
                if (mp.get(tracker) == null) {
                    mp.put(tracker,curr);
                }else if(!mp.get(tracker).equalsIgnoreCase(curr)){
                    mp.put(tracker,curr);
                    context++;
                }
                j++;
            }
        }

        if(n1<n2 || n2<n1){
            context++;
        }
        return context;
    }
}
