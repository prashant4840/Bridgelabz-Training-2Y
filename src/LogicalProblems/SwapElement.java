package Arrays.LogicalProblems;

public class SwapElement {
    static void swap(int[] arr) {

        int temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        swap(arr);

        System.out.println("\n");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}





