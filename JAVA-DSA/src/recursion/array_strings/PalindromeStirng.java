package recursion.array_strings;

public class PalindromeStirng {
    public static boolean check(String name, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (name.charAt(start) != name.charAt(end)) {
            return false;
        }
        return check(name, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String name = "madam";
        System.out.println(check(name, 0, name.length() - 1));
    }
}