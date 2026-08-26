import java.util.*;
public class Problem_08_LongestSubstring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str="";
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int x=str.indexOf(ch);
            if(x>=0)
                str=str.substring(x+1);
            str+=ch;
            ans=Math.max(ans,str.length());
        }
        System.out.println(ans);
    }
}