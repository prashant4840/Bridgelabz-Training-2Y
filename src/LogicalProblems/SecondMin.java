package Arrays.LogicalProblems;

public class SecondMin {
    static int secondLowest(int[] arr) {
        int min = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                second = min;
                min = arr[i];
            }else if(arr[i]<second && arr[i]!=min){
                second = arr[i];
            }
        }
        return second;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 2, 15, 7, 3};
        System.out.println("Second Lowest = " + secondLowest(arr));
    }
}