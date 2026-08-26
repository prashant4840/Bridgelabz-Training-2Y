import java.util.*;
public class Leetcode_485 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] nums=new int[n];

        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();

        int count=0,max=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) count++;
            else count=0;

            if(count>max)
                max=count;
        }

        System.out.println(max);
    }
}