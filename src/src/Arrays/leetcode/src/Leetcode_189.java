import java.util.*;

public class Leetcode_189 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];

        for(int i=0;i<n;i++) nums[i]=sc.nextInt();

        int k=sc.nextInt();
        k=k%n;

        int[] temp=new int[n];

        for(int i=0;i<k;i++) temp[i]=nums[n-k+i];
        for(int i=0;i<n-k;i++) temp[k+i]=nums[i];
        for(int i=0;i<n;i++) nums[i]=temp[i];

        System.out.println(Arrays.toString(nums));
    }
}