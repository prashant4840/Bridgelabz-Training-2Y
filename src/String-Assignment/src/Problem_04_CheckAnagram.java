import java.util.*;
public class Problem_04_CheckAnagram{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(s1.length()!=s2.length()){
            System.out.println("Not Anagram");
            return;
        }
        int[] arr=new int[26];
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)-'a']++;
            arr[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}