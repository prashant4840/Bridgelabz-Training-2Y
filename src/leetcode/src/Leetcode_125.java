import java.util.*;
public class Leetcode_125 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        String str="";

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a'&&ch<='z')||(ch>='0'&&ch<='9'))
                str+=ch;
        }

        int i=0,j=str.length()-1;
        boolean ans=true;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                ans=false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(ans);
    }
}