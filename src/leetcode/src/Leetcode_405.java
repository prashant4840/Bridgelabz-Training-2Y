package Strings.leetcode.src;

import java.util.*;
public class Leetcode_405 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        if(num==0){
            System.out.println("0");
            return;
        }

        String digits="0123456789abcdef";
        String ans="";

        while(num!=0){
            ans=digits.charAt(num&15)+ans;
            num>>>=4;
        }
        System.out.println(ans);
    }
}