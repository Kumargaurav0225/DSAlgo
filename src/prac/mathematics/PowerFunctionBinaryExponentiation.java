package prac.mathematics;

public class PowerFunctionBinaryExponentiation {
    public static void main(String[] args) {
        double b = 3.0;
        int e = 5;
        double res = pow(b, e);
        System.out.println(res);
    }

    private static double pow(double b, int e) {
        double res = 1.0;
        while ( e > 0) {
            if(e % 2 != 0)
                res *= b;
            b =  b * b;
            e =  e / 2;
        }
        return res;
    }
}
