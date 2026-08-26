package Arrays.LogicalProblems;

public class MaxArray {
    static void max(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum = " + max);
    }

    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 80, 20};
        max(arr);
    }
}