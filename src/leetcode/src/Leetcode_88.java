import java.util.*;
public class Leetcode_88{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();

        int[] nums1=new int[m+n];
        int[] nums2=new int[n];

        for(int i=0;i<m+n;i++) nums1[i]=sc.nextInt();
        for(int i=0;i<n;i++) nums2[i]=sc.nextInt();

        for(int i=0;i<n;i++) nums1[m+i]=nums2[i];
        Arrays.sort(nums1);

        for(int i=0;i<nums1.length;i++)
            System.out.print(nums1[i]+" ");
    }
}
