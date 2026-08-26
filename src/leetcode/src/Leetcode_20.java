import java.util.*;
public class Leetcode_20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='[')
                stack.push(ch);
            else{
                if(stack.empty()){
                    System.out.println(false);
                    return;
                }
                char x=stack.pop();
                if((ch==')'&&x!='(')||
                        (ch=='}'&&x!='{')||
                        (ch==']'&&x!='[')){
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(stack.empty());
    }
}