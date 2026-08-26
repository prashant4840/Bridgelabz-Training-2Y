import java.util.*;
public class Leetcode_2129 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] words=s.split(" ");
        String ans="";

        for(int i=0;i<words.length;i++){
            String word=words[i].toLowerCase();
            if(word.length()>2)
                word=Character.toUpperCase(word.charAt(0))
                        +word.substring(1);

            ans+=word;
            if(i<words.length-1)
                ans+=" ";
        }
        System.out.println(ans);
    }
}