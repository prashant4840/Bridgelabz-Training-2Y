import java.util.*;
public class Leetcode_3158{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
        int result=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]) count++;
            }
            if(count==2){
                boolean check=true;
                for(int j=0;j<i;j++){
                    if(nums[i]==nums[j]){
                        check=false;
                        break;
                    }
                }
                if(check) result^=nums[i];
            }
        }
        System.out.println(result);
    }
}