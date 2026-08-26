import java.util.*;
public class Leetcode_3043{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int m=sc.nextInt();
        int[] b=new int[m];
        for(int i=0;i<m;i++)
            b[i]=sc.nextInt();
        int ans=0;
        for(int i=0;i<n;i++){
            String s1=""+a[i];
            for(int j=0;j<m;j++){
                String s2=""+b[j];
                int k=0;
                while(k<s1.length()&&k<s2.length()&&s1.charAt(k)==s2.charAt(k))
                    k++;
                ans=Math.max(ans,k);
            }
        }
        System.out.println(ans);
    }
}