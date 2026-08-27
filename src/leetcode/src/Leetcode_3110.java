package leetcode.src;
import java.util.*;
public class Leetcode_3110{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int sum=0;
        for(int i=1;i<s.length();i++){
            int a=s.charAt(i);
            int b=s.charAt(i-1);
            sum+=Math.abs(a-b);
        }
        System.out.println(sum);
    }
}