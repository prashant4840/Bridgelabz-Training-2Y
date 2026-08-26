package Arrays.LogicalProblems;

public class MinimumElement{
    static int min(int[] arr) {
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<min)
                min = arr[i];
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 2, 15, 7, 3};
        System.out.println("Minimum = " + min(arr));
    }
}