import java.util.*;
public class Leetcode_3232 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];

        for(int i=0;i<n;i++) nums[i]=sc.nextInt();

        int one=0,two=0;
        for(int i=0;i<n;i++){
            if(nums[i]<10) one+=nums[i];
            else two+=nums[i];
        }
        System.out.println(one!=two);
    }
}