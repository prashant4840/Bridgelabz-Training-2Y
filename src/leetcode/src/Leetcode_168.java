import java.util.*;
public class Leetcode_168 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans="";

        while(n>0){
            n--;
            char ch=(char)('A'+n%26);
            ans=ch+ans;
            n=n/26;
        }
        System.out.println(ans);
    }
}