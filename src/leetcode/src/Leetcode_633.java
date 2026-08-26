import java.util.*;
public class Leetcode_633 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int i = 0;
        long j = (long) Math.sqrt(c);

        while (i <= j) {
            long sum = (long) i * i + j * j;
            if (sum == c) {
                System.out.println(true);
                return;
            }
            if (sum < c)i++;
            else j--;
        }
        System.out.println(false);
    }
}