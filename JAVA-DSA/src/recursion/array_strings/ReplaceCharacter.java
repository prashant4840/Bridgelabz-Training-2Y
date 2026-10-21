package recursion.array_strings;

public class ReplaceCharacter {
    public static String replace(String name, int index) {
        if (index == name.length()) return "";
        char ch = name.charAt(index);
        if (ch == 'a') ch = 'b';
        return ch + replace(name, index + 1);
    }

    public static void main(String[] args) {
        String name = "banana";
        System.out.println(replace(name, 0));
    }
}