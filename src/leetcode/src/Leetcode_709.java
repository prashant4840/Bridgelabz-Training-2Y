import java.util.*;
public class Leetcode_709{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A'&&ch<='Z')
                ch=(char)(ch+32);
            ans+=ch;
        }
        System.out.println(ans);
    }
}