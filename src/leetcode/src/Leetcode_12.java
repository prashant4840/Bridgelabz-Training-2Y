import java.util.*;
public class Leetcode_12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] str={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String ans="";
        for(int i=0;i<num.length;i++){
            while(n>=num[i]){
                ans+=str[i];
                n-=num[i];
            }
        }
        System.out.println(ans);
    }
}