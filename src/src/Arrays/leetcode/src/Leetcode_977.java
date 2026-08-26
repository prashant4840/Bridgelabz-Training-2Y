import java.util.*;

public class Leetcode_977 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i=0; i<n; i++) nums[i] = sc.nextInt();
        for (int i=0; i<n; i++) nums[i] = nums[i]*nums[i];

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}