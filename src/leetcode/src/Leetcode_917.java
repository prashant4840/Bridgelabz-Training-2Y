import java.util.*;
public class Leetcode_917{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] arr=s.toCharArray();
        int i=0,j=arr.length-1;
        while(i<j){
            if(!Character.isLetter(arr[i]))
                i++;
            else if(!Character.isLetter(arr[j]))
                j--;
            else{
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        System.out.println(new String(arr));
    }
}