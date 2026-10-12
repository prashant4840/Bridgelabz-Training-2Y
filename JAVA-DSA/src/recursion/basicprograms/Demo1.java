package recursion.basicprograms;

public class Demo1 {
    public static int add(int a, int b) {
        return a + b;
    }

   public static int mul(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        System.out.println(add(a, b));
        System.out.println(mul(a, b));
    }
}