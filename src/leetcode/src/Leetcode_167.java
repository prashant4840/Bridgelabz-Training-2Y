import java.util.*;
public class Leetcode_167{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] numbers=new int[n];
        for(int i=0;i<n;i++)
            numbers[i]=sc.nextInt();
        int target=sc.nextInt();
        int start=0;
        int end=n-1;
        while(start<end){
            if(numbers[start]+numbers[end]>target)
                end--;
            else if(numbers[start]+numbers[end]<target)
                start++;
            else{
                System.out.println((start+1)+" "+(end+1));
                return;
            }
        }
        System.out.println("-1 -1");
    }
}