import java.util.*;
public class Problem_10_LongestPalindromicSubstring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                int a=i,b=j;
                boolean check=true;
                while(a<b){
                    if(s.charAt(a)!=s.charAt(b)){
                        check=false;
                        break;
                    }
                    a++;
                    b--;
                }
                if(check&&j-i+1>ans.length())
                    ans=s.substring(i,j+1);
            }
        }
        System.out.println(ans);
    }
}