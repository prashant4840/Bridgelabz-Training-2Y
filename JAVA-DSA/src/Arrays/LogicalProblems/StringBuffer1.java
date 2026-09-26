import java.util.Scanner;

public class StringBuffer1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();

        sc.nextLine();

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter string: ");
            String str = sc.nextLine();

            sb.append(str);
        }

        System.out.println("Concatenated string = " + sb);
    }
}