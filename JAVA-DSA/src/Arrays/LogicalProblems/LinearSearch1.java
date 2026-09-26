import java.util.Scanner;

public class LinearSearch1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = -1;

        for (int i = 0; i < n; i++) {

            if (arr[i] < 0) {
                index = i;
                break;
            }
        }

        System.out.println("First negative number index = " + index);
    }
}