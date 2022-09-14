package prac.recursion;

public class LogNBase2 {
    public static void main(String[] args) {
        System.out.println(fun(16));
    }

    private static int fun(int n) {
        if(n==1)
            return 0;
        else
            return 1+fun(n/2);
    }
}
