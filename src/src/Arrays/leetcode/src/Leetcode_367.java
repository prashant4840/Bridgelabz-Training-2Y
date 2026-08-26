package Strings.leetcode.src;

import java.util.*;
public class Leetcode_367 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        boolean result=false;

        for(long i=1;i*i<=num;i++){
            if(i*i==num){
                result=true;
                break;
            }
        }
        System.out.println(result);
    }
}