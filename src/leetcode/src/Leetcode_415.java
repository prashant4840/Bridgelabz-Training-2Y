package Strings.leetcode.src;

import java.util.*;
public class Leetcode_415 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String num1=sc.next();
        String num2=sc.next();

        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        String ans="";

        while(i>=0||j>=0||carry>0){
            int a=0,b=0;

            if(i>=0) a=num1.charAt(i--)-'0';
            if(j>=0) b=num2.charAt(j--)-'0';

            int sum=a+b+carry;
            ans=(sum%10)+ans;
            carry=sum/10;
        }
        System.out.println(ans);
    }
}