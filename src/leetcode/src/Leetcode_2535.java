package leetcode.src;
import java.util.*;
public class Leetcode_2535{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
        int arraySum=0;
        int elementSum=0;
        for(int i=0;i<nums.length;i++){
            arraySum+=nums[i];
            int num=nums[i];
            while(num>0){
                elementSum+=num%10;
                num=num/10;
            }
        }
        System.out.println(Math.abs(arraySum-elementSum));
    }
}