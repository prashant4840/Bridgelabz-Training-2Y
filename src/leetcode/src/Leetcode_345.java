import java.util.*;
public class Leetcode_345 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] arr=s.toCharArray();

        int i=0,j=arr.length-1;
        while(i<j){
            while(i<j && !isVowel(arr[i])) i++;

            while(i<j && !isVowel(arr[j])) j--;

            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(new String(arr));
    }
    static boolean isVowel(char ch) {
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
}