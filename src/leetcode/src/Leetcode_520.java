import java.util.*;
public class Leetcode_520 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
                count++;
        }
        if(count==0 || count==s.length() ||
                (count==1 && s.charAt(0)>='A'&&s.charAt(0)<='Z'))
            System.out.println(true);
        else
            System.out.println(false);
    }
}