package prac.mathematics;

public class PowerFuncDivideAndConquer {
    public static void main(String[] args) {
            double b = 3.0;
            int e = 5;
            double res = power(b, e);
            System.out.println(res);
    }

    private static double power(double b, int e) {
        if(e == 0)
            return 1;
        if(e <= 0)
            return 1/power(b, -e);
        double temp = power(b, e /2);
        double res = temp * temp;
        return (e % 2 == 0) ? res : res * b;
    }
}
