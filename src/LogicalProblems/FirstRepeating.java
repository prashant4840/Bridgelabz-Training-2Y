package Arrays.LogicalProblems;
import java.util.Scanner;

public class FirstRepeating {
    static void display(int[] arr) {

        System.out.print("Array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void firstRepeating(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println("First Repeating Element = " + arr[i]);
                    return;
                }
            }
        }

        System.out.println("No Repeating Element");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        display(arr);

        firstRepeating(arr);
    }
}