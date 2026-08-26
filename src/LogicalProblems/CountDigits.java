package Arrays;

import java.util.Scanner;
public class CountDigits {
    public static int countDigits(int n) {
        if (n == 0) return 1;
        int count = 0;

        while (n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigits(n));
    }
}