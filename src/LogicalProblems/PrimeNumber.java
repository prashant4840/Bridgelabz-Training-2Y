package Arrays.LogicalProblems;

public class PrimeNumber {
    static void prime(int[] arr) {
        System.out.print("Prime Numbers: ");
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=1; j<=arr[i]; j++){
                if(arr[i] % j == 0)
                    count++;
            }
            if(count == 2)
                System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 2, 15, 7, 3};
        prime(arr);
    }
}