import java.util.*;
public class Leetcode_1662{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] a=new String[n];
        for(int i=0;i<n;i++)
            a[i]=sc.next();
        int m=sc.nextInt();
        String[] b=new String[m];
        for(int i=0;i<m;i++)
            b[i]=sc.next();
        String s1="",s2="";
        for(int i=0;i<n;i++)
            s1+=a[i];
        for(int i=0;i<m;i++)
            s2+=b[i];
        System.out.println(s1.equals(s2));
    }
}