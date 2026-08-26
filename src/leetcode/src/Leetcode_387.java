import java.util.*;
public class Leetcode_387{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] arr=new int[256];
        for(int i=0;i<s.length();i++)
            arr[s.charAt(i)]++;
        int ans=-1;
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)]==1){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}