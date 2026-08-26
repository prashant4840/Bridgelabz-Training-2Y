import java.util.*;
public class Leetcode_2414{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=1,ans=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)+1)
                count++;
            else
                count=1;
            ans=Math.max(ans,count);
        }
        System.out.println(ans);
    }
}