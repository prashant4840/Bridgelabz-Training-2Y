import java.util.*;
public class Leetcode_26{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
        int a=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[a-1]){
                nums[a]=nums[i];
                a++;
            }
        }
        System.out.println(a);
        for(int i=0;i<a;i++)
            System.out.print(nums[i]+" ");
    }
}