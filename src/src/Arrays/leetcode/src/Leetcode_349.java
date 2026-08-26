import java.util.*;

public class Leetcode_349 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        int m=sc.nextInt();
        int[] b=new int[m];

        for(int i=0;i<m;i++) b[i]=sc.nextInt();

        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> result=new HashSet<>();

        for(int i=0;i<n;i++) set.add(a[i]);

        for(int i=0;i<m;i++){
            if(set.contains(b[i])) result.add(b[i]);
        }
        System.out.println(result);
    }
}