import java.util.*;

public class Leetcode_628 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] nums=new int[n];

        for(int i=0;i<n;i++) nums[i]=sc.nextInt();

        Arrays.sort(nums);

        int ans=Math.max(nums[n-1]*nums[n-2]*nums[n-3],
                nums[0]*nums[1]*nums[n-1]);

        System.out.println(ans);
    }
}