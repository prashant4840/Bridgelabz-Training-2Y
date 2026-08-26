import java.util.*;
public class Leetcode_171{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int ans=0;
        for(int i=0;i<s.length();i++)
            ans=ans*26+s.charAt(i)-'A'+1;
        System.out.println(ans);
    }
}