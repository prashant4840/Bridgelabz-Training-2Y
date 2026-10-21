package recursion.array_strings;

public class StringLength {
    public static int count(String name, int index) {
        try {
            name.charAt(index);
            return 1 + count(name, index + 1);
        } catch (StringIndexOutOfBoundsException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        String name = "hello";
        System.out.println(count(name, 0));
    }
}