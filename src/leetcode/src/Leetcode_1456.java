import java.util.*;
public class Leetcode_1456{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        int count=0,ans=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i)))
                count++;
        }
        ans=count;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i)))
                count++;
            if(isVowel(s.charAt(i-k)))
                count--;
            ans=Math.max(ans,count);
        }
        System.out.println(ans);
    }
    static boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}