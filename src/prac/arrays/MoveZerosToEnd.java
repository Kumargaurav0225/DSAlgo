package prac.arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,0,0,3,0,4,0,0,5};
        moveZeroes(arr);
        for (int i: arr) {
            System.out.print(i+" ");
        }
    }

    private static void moveZeroes(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
}
