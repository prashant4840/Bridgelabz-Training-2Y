import java.util.*;
public class Problem_07_ValidParentheses{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> stack=new Stack<>();
        boolean ans=true;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{')
                stack.push(ch);
            else{
                if(stack.empty()){
                    ans=false;
                    break;
                }
                char top=stack.pop();
                if(ch==')'&&top!='('||ch==']'&&top!='['||ch=='}'&&top!='{'){
                    ans=false;
                    break;
                }
            }
        }
        if(!stack.empty())
            ans=false;
        System.out.println(ans);
    }
}