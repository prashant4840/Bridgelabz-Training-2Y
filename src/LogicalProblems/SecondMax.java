package Arrays.LogicalProblems;

public class SecondMax {
    static int secondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                second = max;
                max = arr[i];
            }else if(arr[i]>second && arr[i]!=max){
                second = arr[i];
            }
        }
        return second;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 2, 15, 7, 3};
        System.out.println("Second Highest = " + secondMax(arr));
    }
}