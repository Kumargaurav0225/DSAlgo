package prac.mathematics;

public class PalindromeNumber {

    public static void main(String[] args) {
        int num = 12321;
        System.out.println(isPalindrome(num));
    }

    private static boolean isPalindrome(int num) {
        int rev = 0;
        int temp = num;
        while(temp != 0){
            int lastDigit = temp % 10;
            rev = rev *10 + lastDigit;
            temp = temp / 10;
        }
        return (rev == num);
    }
}
