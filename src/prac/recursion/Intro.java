package prac.recursion;

public class Intro {
    public static void foo(int n){
        if(n == 0) return;
        System.out.println("Printed "+n);
        foo(n-1);
    }

    public static void main(String[] args) {
        foo(3);
    }
}
