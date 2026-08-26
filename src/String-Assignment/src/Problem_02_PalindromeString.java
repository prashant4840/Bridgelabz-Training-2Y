import java.util.*;
public class Problem_02_PalindromeString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i=0,j=s.length()-1;
        boolean ans=true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                ans=false;
                break;
            }
            i++;
            j--;
        }
        if(ans)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}