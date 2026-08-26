package Arrays.LogicalProblems;

import java.util.Scanner;

public class RemoveDuplicate{
    static void removeDuplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array after removing duplicates: ");
        removeDuplicate(arr);
    }
}