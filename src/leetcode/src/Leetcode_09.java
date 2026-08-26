package Arrays;

import java.util.*;
public class Leetcode_09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();

        if(x<0){
            System.out.println(false);
            return;
        }

        int rev=0,org=x;

        while(x!=0){
            int digit=x%10;
            rev=rev*10+digit;
            x/=10;
        }

        System.out.println(rev==org);
    }
}