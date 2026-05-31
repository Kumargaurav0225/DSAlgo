package prac.mathematics;

public class FactorialRecursive {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(0));
    }

    public static  int factorial(int num) {
        if( num == 0)
            return 1;
        return num * factorial(num - 1);
    }
}
