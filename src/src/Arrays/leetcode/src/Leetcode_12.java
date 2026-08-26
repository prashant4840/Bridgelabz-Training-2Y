import java.util.*;

public class Leetcode_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String result="";
        for(int i=0;i<values.length;i++){
            while(num>=values[i]){
                result+=roman[i];
                num-=values[i];
            }
        }

        System.out.println(result);
    }
}