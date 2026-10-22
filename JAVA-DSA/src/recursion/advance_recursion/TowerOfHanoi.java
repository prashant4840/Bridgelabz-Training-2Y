package recursion.advance_recursion;

public class TowerOfHanoi {
    public static void toh(int n, char source, char destination, char helper) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        toh(n - 1, source, helper, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        toh(n - 1, helper, destination, source);
    }

    public static void main(String[] args) {
        int n = 3;
        toh(n, 'A', 'C', 'B');
    }
}