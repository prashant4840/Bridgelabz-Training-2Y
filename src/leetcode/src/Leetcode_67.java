package Strings.leetcode.src;

import java.util.*;
public class Leetcode_67 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String a=sc.next();
        String b=sc.next();

        int i=a.length()-1,j=b.length()-1,carry=0;
        String ans="";

        while(i>=0||j>=0||carry>0){
            int x=0,y=0;

            if(i>=0) x=a.charAt(i--)-'0';
            if(j>=0) y=b.charAt(j--)-'0';

            int sum=x+y+carry;
            ans=(sum%2)+ans;
            carry=sum/2;
        }

        System.out.println(ans);
    }
}