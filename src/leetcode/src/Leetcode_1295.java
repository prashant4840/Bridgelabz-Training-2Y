import java.util.*;
public class Leetcode_1295 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if ((nums[i] > 9 && nums[i] < 100) ||
                    (nums[i] > 999 && nums[i] < 10000) ||
                    nums[i] == 100000) {
                count++;
            }
        }
        System.out.println(count);
    }
}