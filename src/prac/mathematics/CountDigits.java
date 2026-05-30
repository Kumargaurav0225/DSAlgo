package prac.mathematics;

public class CountDigits {

    public static int countDigits(int num){
        int res = 0;
        while(num>0){
            num = num/10;
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Number of digits "+countDigits(999));
        System.out.println("Number of digits "+countDigits(24));
        System.out.println("Number of digits "+countDigits(7654321));
        System.out.println("Number of digits "+countDigits(1));
    }
}
