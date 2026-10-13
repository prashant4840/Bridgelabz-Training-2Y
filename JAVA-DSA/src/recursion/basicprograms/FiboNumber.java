package recursion.basicprograms;
import java.util.*;
public class FiboNumber {
    static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int s1 = fib(n - 1);
        int s2 = fib(n - 2);
        return s1 + s2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        int n = sc.nextInt();                  //  int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}