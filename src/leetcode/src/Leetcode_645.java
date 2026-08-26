import java.util.*;
public class Leetcode_645{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
        int[] count=new int[n+1];
        for(int i=0;i<n;i++)
            count[nums[i]]++;
        int[] ans=new int[2];
        for(int i=1;i<=n;i++){
            if(count[i]==2) ans[0]=i;
            if(count[i]==0) ans[1]=i;
        }
        System.out.println(ans[0]+" "+ans[1]);
    }
}