import java.util.*;
public class Leetcode_2062{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int ans=0;
        for(int i=0;i<s.length();i++){
            boolean[] arr=new boolean[5];
            int count=0;
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(!isVowel(ch))
                    break;
                int x=vowel(ch);
                if(!arr[x]){
                    arr[x]=true;
                    count++;
                }
                if(count==j-i+1)
                    ans++;
            }
        }
        System.out.println(ans);
    }
    static boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    static int vowel(char ch){
        if(ch=='a')return 0;
        if(ch=='e')return 1;
        if(ch=='i')return 2;
        if(ch=='o')return 3;
        return 4;
    }
}