package Strings.leetcode.src;

import java.util.*;
public class Leetcode_350 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        int m=sc.nextInt();
        int[] b=new int[m];
        for(int i=0;i<m;i++) b[i]=sc.nextInt();

        ArrayList<Integer> list=new ArrayList<>();
        boolean[] used=new boolean[m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i]==b[j]&&!used[j]){
                    list.add(a[i]);
                    used[j]=true;
                    break;
                }
            }
        }

        System.out.println(list);
    }
}