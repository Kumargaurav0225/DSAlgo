package prac.recursion;

public class PrintNTo1 {
    public static void main(String[] args) {
        int n = 5;
        fun(5);
    }

    private static void fun(int n) {
        if(n == 0)
            return;
        else{
            System.out.println(n);
            fun(n-1);
        }
    }
}
