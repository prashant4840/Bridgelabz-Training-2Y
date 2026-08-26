import java.util.*;
public class Problem_09_GroupAnagrams{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.next();
        boolean[] used=new boolean[n];
        for(int i=0;i<n;i++){
            if(used[i])
                continue;
            System.out.print("[");
            for(int j=i;j<n;j++){
                if(!used[j]&&same(arr[i],arr[j])){
                    System.out.print(arr[j]+" ");
                    used[j]=true;
                }
            }
            System.out.println("]");
        }
    }
    static boolean same(String s1,String s2){
        if(s1.length()!=s2.length())
            return false;
        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}