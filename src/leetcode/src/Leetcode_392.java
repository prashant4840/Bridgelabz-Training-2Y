import java.util.*;
public class Leetcode_392{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        int i=0,j=0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j))
                i++;
            j++;
        }
        System.out.println(i==s.length());
    }
}