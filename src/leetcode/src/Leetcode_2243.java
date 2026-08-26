package Strings.leetcode.src;

import java.util.*;
public class Leetcode_2243 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.next();
        int k=sc.nextInt();

        while(s.length()>k){
            String result="";

            for(int i=0;i<s.length();i+=k){
                int sum=0;
                for(int j=i;j<i+k&&j<s.length();j++)
                    sum+=s.charAt(j)-'0';
                result+=sum;
            }
            s=result;
        }
        System.out.println(s);
    }
}