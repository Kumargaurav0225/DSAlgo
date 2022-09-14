package prac.recursion;

public class Print1ToN {
    public static void main(String[] args) {
        int n = 5;
        fun(n);
    }

    private static void fun(int n) {
        if(n == 0) {
            return;
        }
        else {
            fun(n-1);
            System.out.println(n);
        }
    }
}
