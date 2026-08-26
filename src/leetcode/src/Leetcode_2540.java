package Strings.leetcode.src;

import java.util.*;

public class Leetcode_2540 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt(),m;
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        m=sc.nextInt();
        int[] b=new int[m];
        for(int i=0;i<m;i++) b[i]=sc.nextInt();

        int i=0,j=0;

        while(i<n&&j<m){
            if(a[i]==b[j]){
                System.out.println(a[i]);
                return;
            }
            if(a[i]<b[j]) i++;
            else j++;
        }

        System.out.println(-1);
    }
}