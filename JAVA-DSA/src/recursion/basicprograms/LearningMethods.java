package recursion.basicprograms;

public class LearningMethods {
    static void method1() {
        int x1 = 1;
        method2();
        System.out.println(x1);
    }

    static void method2() {
        int x2 = 2;
        method3();
        System.out.println(x2);
    }

    static void method3() {
        int x3 = 3;
        System.out.println(x3);
    }

    public static void main(String[] args) {
        method1();
    }
}