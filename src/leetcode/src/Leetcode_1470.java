package leetcode.src;
import java.util.*;
public class Leetcode_1470{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[2*n];
        for(int i=0;i<2*n;i++)
            nums[i]=sc.nextInt();
        int[] result=new int[nums.length];
        int j=n;
        int k=0;
        for(int i=0;i<n;i++){
            result[k]=nums[i];
            k++;
            result[k]=nums[j];
            k++;
            j++;
        }
        for(int i=0;i<result.length;i++)
            System.out.print(result[i]+" ");
    }
}