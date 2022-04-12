package prac.arrays;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,6,5};
        leftRotate(arr);
        for (int i: arr) {
            System.out.print(i+" ");
        }
    }

    private static void leftRotate(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1]=temp;
    }
}
