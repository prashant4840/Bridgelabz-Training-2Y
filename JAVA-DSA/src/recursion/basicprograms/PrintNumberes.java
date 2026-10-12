package recursion.basicprograms;

public class PrintNumberes {
    static void print(int n) {
        if (n == -10) {
            System.out.println(n + " ");
            return;
        }
        //base case
        print(n-1);
        //recursive work
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        print(10);
    }
}
