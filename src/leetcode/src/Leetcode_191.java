import java.util.*;
public class Leetcode_191{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(n>0){
            if(n%2==1) c++;
            n=n/2;
        }
        System.out.println(c);
    }
}