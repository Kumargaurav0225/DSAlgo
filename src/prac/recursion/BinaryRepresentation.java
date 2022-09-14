package prac.recursion;

public class BinaryRepresentation {
    public static void main(String[] args) {
        fun(13);
    }

    private static void fun(int n) {
        if(n == 0)
            return;
        fun(n/2);
        System.out.println(n%2);
    }
}
