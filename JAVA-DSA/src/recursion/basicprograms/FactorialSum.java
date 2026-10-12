package recursion.basicprograms;

public class FactorialSum {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int small = sum(n - 1);
        return small + n;
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}