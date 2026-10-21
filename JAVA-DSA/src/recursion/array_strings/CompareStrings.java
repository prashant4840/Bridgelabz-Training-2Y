package recursion.array_strings;

public class CompareStrings {
    public static boolean check(String a, String b, int index) {
        if (index == a.length() && index == b.length()) return true;
        if (index >= a.length() || index >= b.length()) return false;
        if (a.charAt(index) != b.charAt(index)) return false;
        return check(a, b, index + 1);
    }

    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        System.out.println(check(a, b, 0));
    }
}