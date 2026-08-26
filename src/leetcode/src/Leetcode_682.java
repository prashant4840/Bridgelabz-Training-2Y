import java.util.*;
public class Leetcode_682{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] operations=new String[n];

        for(int i=0;i<n;i++)
            operations[i]=sc.next();

        int[] a=new int[n];
        int x=0;

        for(int i=0;i<n;i++){
            if(operations[i].equals("C"))
                x--;
            else if(operations[i].equals("D")){
                a[x]=a[x-1]*2;
                x++;
            }
            else if(operations[i].equals("+")){
                a[x]=a[x-1]+a[x-2];
                x++;
            }
            else{
                a[x]=Integer.parseInt(operations[i]);
                x++;
            }
        }
        int sum=0;
        for(int i=0;i<x;i++)
            sum+=a[i];

        System.out.println(sum);
    }
}