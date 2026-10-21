package recursion.array_strings;

public class AllBasicMethod {

    public static void print(String name, int index) {
        if (index == name.length()) return;
        System.out.print(name.charAt(index));
        print(name, index + 1);
    }

    public static void reverse(String name, int index) {
        if (index == name.length()) return;
        reverse(name, index + 1);
        System.out.print(name.charAt(index));
    }

    public static boolean palindrome(String name, int start, int end) {
        if (start >= end) return true;
        if (name.charAt(start) != name.charAt(end)) return false;
        return palindrome(name, start + 1, end - 1);
    }

    public static String removeLetter(String name, int index, char ch, String small) {
        if (index == name.length()) return small;
        ch = name.charAt(index);
        if (ch != 'a') small += ch;
        return removeLetter(name, index + 1, ch, small);
    }

    public static void main(String[] args) {
        String name = "prashant";

        print(name, 0);
        reverse(name, 0);
        System.out.println(palindrome(name, 0, name.length() - 1));
        System.out.println(removeLetter(name, 0, ' ', ""));
    }
}