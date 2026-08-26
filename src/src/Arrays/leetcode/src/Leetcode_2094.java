import java.util.*;
public class Leetcode_2094 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] digits=new int[n];

        for(int i=0;i<n;i++)
            digits[i]=sc.nextInt();

        int[] count=new int[10];
        for(int x:digits)
            count[x]++;

        ArrayList<Integer> list=new ArrayList<>();

        for(int num=100;num<=998;num+=2){
            int a=num/100;
            int b=(num/10)%10;
            int c=num%10;
            int[] temp=count.clone();

            if(temp[a]>0){ temp[a]--;
                if(temp[b]>0){ temp[b]--;
                    if(temp[c]>0) list.add(num);
                }
            }
        }
        System.out.println(list);
    }
}