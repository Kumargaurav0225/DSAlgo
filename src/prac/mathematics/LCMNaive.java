package prac.mathematics;

public class LCMNaive {

    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println(lcm(a, b));
    }

    private static int lcm(int a, int b) {
        int largeNum = Math.max(a, b);
        int smallNum = Math.min(a, b);

        if(largeNum % smallNum == 0) return largeNum;

        int res = a*b;
        for(int i = largeNum; i < a*b ; i++){
            if(i % largeNum == 0 && i % smallNum == 0)
                return i;
        }
        return res;
    }
}
