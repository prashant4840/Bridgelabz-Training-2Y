import java.util.*;
public class Leetcode_03 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i=0,j=0,ans=0;
        String str="";
        while(j<s.length()){
            char ch=s.charAt(j);
            int x=str.indexOf(ch);
            if(x>=0){
                str=str.substring(x+1);
            }
            str+=ch;
            ans=Math.max(ans,str.length());
            j++;
        }
        System.out.println(ans);
    }
}