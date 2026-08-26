package Strings.leetcode.src;

import java.util.*;
public class Leetcode_1108 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String address=sc.nextLine();
        String result=address.replace(".", "[.]");
        System.out.println(result);
    }
}