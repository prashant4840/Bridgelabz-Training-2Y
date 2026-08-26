import java.util.*;
public class Problem_05_CharacterFrequency{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean[] used=new boolean[256];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(used[ch])
                continue;
            int count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==ch)
                    count++;
            }
            System.out.println(ch+" : "+count);
            used[ch]=true;
        }
    }
}