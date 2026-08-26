package Strings.leetcode.src;

import java.util.*;
public class Leetcode_258 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int result=1+(num-1)%9;

        System.out.println(result);
    }
}