import java.util.*;
public class Leetcode_2733 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];

        for(int i=0;i<n;i++) nums[i]=sc.nextInt();
        if(n<3){
            System.out.println(-1);
            return;
        }

        int min=nums[0],max=nums[0];

        for(int i=1;i<n;i++){
            if(nums[i]<min) min=nums[i];
            if(nums[i]>max) max=nums[i];
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=min&&nums[i]!=max){
                System.out.println(nums[i]);
                return;
            }
        }
        System.out.println(-1);
    }
}