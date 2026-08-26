import java.util.*;
public class Leetcode_605{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] flowerbed=new int[n];
        for(int i=0;i<n;i++)
            flowerbed[i]=sc.nextInt();
        int x=sc.nextInt();
        int count=0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0 &&
                    (i==0||flowerbed[i-1]==0) &&
                    (i==flowerbed.length-1||flowerbed[i+1]==0)){
                flowerbed[i]=1;
                count++;
            }
        }
        System.out.println(count>=x);
    }
}