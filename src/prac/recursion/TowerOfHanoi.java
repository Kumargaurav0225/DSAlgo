package prac.recursion;

public class TowerOfHanoi {

    public static void main(String[] args) {
        int n = 3;
        toh(n, "S", "H", "D");
    }

    private static void toh(int n, String source, String helper, String destination) {

        if (n == 1) // Base case if there is only disk remaining then copy it from source to destination
        {
            System.out.println("Move 1 from " +  source + " to " + destination);
            return;
        }

        toh(n-1, source, destination, helper); // Copy N-1 disks from source to helper using destination as buffer
        System.out.println("Move " + n + " from " +  source + " to " + destination); // Copy Nth disk from source to destination
        toh(n-1, helper, source, destination); // Copy N-1 disk from helper to destination using source as buffer
    }
}
