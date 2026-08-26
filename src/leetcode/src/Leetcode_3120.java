import java.util.*;
public class Leetcode_3120{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        int count=0;
        for(char c='a';c<='z';c++){
            if(word.indexOf(c)>=0&&word.indexOf(c-32)>=0)
                count++;
        }
        System.out.println(count);
    }
}