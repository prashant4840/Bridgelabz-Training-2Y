import java.util.*;
public class Leetcode_989 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] num=new int[n];

        for(int i=0;i<n;i++)
            num[i]=sc.nextInt();

        int k=sc.nextInt();
        ArrayList<Integer> ans=new ArrayList<>();

        int i=n-1;
        while(i>=0||k>0){
            if(i>=0)
                k+=num[i--];

            ans.add(k%10);
            k/=10;
        }
        Collections.reverse(ans);
        System.out.println(ans);
    }
}