import java.util.*;
public class Leetcode_1281 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int prod=1,sum=0;

        while(n!=0){
            int x=n%10;
            prod*=x;
            sum+=x;
            n/=10;
        }

        System.out.println(prod-sum);
    }
}