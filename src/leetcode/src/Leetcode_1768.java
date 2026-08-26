import java.util.*;
public class Leetcode_1768 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String ans="";

        int i=0;
        while(i<s1.length() || i<s2.length()){
            if(i<s1.length())
                ans+=s1.charAt(i);
            if(i<s2.length())
                ans+=s2.charAt(i);
            i++;
        }
        System.out.println(ans);
    }
}