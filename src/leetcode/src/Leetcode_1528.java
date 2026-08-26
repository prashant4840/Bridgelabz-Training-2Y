import java.util.*;
public class Leetcode_1528{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] indices=new int[s.length()];
        for(int i=0;i<indices.length;i++)
            indices[i]=sc.nextInt();
        char[] ans=new char[s.length()];
        for(int i=0;i<s.length();i++)
            ans[indices[i]]=s.charAt(i);
        System.out.println(new String(ans));
    }
}