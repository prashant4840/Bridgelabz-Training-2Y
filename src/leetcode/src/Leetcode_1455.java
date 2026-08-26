import java.util.*;
public class Leetcode_1455{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        String search=sc.nextLine();
        String[] arr=sentence.split(" ");
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i].startsWith(search)){
                ans=i+1;
                break;
            }
        }
        System.out.println(ans);
    }
}