package recursion.basicprograms;

public class Demo1 {
    static void function1() {
        int x1 = 1;
        function2();
        System.out.println(x1);
    }

    static void function2() {
        int x2 = 2;
        function3();
        System.out.println(x2);
    }

    static void function3() {
        int x3 = 3;
        System.out.println(x3);
    }

    public static void main(String[] args) {
        function1();
    }
}