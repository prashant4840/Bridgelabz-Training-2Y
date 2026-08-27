package leetcode.src;
import java.util.*;
public class Leetcode_1684{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String allowed=sc.nextLine();
        int n=sc.nextInt();
        String[] words=new String[n];
        for(int i=0;i<words.length;i++)
            words[i]=sc.next();
        int count=0;
        for(int i=0;i<words.length;i++){
            if(words[i].matches("["+allowed+"]*"))
                count++;
        }
        System.out.println(count);
    }
}