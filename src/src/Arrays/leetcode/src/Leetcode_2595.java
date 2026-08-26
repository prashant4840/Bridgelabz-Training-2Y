import java.util.*;
public class Leetcode_2595 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ans=new int[2];
        int i=0;
        while(n>0){
            if((n&1)==1) {ans[i%2]++;}
                n>>=1;
                i++;
        }
        System.out.println(Arrays.toString(ans));
    }
}