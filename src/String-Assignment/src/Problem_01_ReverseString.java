import java.util.*;
public class Problem_01_ReverseString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans="";
        for(int i=s.length()-1;i>=0;i--)
            ans+=s.charAt(i);
        System.out.println(ans);
    }
}