import java.util.*;
public class Leetcode_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        sc.nextLine();

        String[] arr=new String[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextLine();
        String ans="";
        for(int i=0;i<arr[0].length();i++){
            char ch=arr[0].charAt(i);
            for(int j=1;j<n;j++){
                if(i>=arr[j].length() || arr[j].charAt(i)!=ch){
                    System.out.println(ans);
                    return;
                }
            }
            ans+=ch;
        }
        System.out.println(ans);
    }
}