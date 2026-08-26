package Strings.leetcode.src;

import java.util.*;
public class Leetcode_1832 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        boolean[] alpha=new boolean[26];
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            alpha[ch-'a']=true;
        }

        for(int i=0;i<26;i++){
            if(alpha[i]==false){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }

    public static class Leetcode_69 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            int x=sc.nextInt();
            int result=(int)Math.sqrt(x);

            System.out.println(result);
        }
    }

    public static class Leetcode_202 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            while(n!=1&&n!=4){
                int sum=0;

                while(n>0){
                    int d=n%10;
                    sum+=d*d;
                    n/=10;
                }
                n=sum;
            }
            System.out.println(n==1);
        }
    }
}