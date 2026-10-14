package recursion.basicprograms;
public class PrintArray {
    public static void printDec(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        printDec(arr, index + 1);
        System.out.print(arr[index] + " ");
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        printDec(arr, 0);
    }
}