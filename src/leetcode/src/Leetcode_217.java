import java.util.*;
public class Leetcode_217{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                System.out.println(true);
                return;
            }
            set.add(nums[i]);
        }
        System.out.println(false);
    }
}