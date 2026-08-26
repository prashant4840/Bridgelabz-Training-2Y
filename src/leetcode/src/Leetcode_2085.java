package Strings.leetcode.src;
import java.util.*;

public class Leetcode_2085 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        String[] a=new String[n];

        for(int i=0;i<n;i++) a[i]=sc.next();
        int m=sc.nextInt();
        String[] b=new String[m];

        for(int i=0;i<m;i++) b[i]=sc.next();
        int count=0;
        for(int i=0;i<n;i++){
            int c1=0,c2=0;
            for(int j=0;j<n;j++)
                if(a[i].equals(a[j]))
                    c1++;

            for(int j=0;j<m;j++)
                if(a[i].equals(b[j]))
                    c2++;

            if(c1==1&&c2==1) count++;
        }

        System.out.println(count);
    }
}