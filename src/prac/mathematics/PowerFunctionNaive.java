package prac.mathematics;

public class PowerFunctionNaive {
    public static void main(String[] args) {
        double b = 3.0;
        int e = 5;
        double res = pow(b, e);
        System.out.println(res);
        System.out.println(powRecursive(b, e));
    }

    private static double pow(double b, int e) {
        double res = 1;
        for(int i = 0; i < Math.abs(e); i++){
            res *= b;
        }
        if(e < 0) {
            res = 1 / res;
        }
        return res;
    }

    private static double powRecursive(double b, int e) {
        if(e == 0) return 1;
        if(e < 0) return 1 / powRecursive(b, -e);
        return b * powRecursive(b, e - 1);
    }
}
