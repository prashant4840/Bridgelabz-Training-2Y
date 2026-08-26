import java.util.*;
public class Leetcode_2379{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        int count=0,ans=k;
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='W')
                count++;
        }
        ans=count;
        for(int i=k;i<s.length();i++){
            if(s.charAt(i)=='W')
                count++;
            if(s.charAt(i-k)=='W')
                count--;
            ans=Math.min(ans,count);
        }
        System.out.println(ans);
    }
}