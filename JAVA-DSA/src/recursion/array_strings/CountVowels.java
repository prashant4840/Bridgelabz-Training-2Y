package recursion.array_strings;

public class CountVowels {
    public static int count(String name, int index) {
        if (index == name.length()) return 0;
        char ch = Character.toLowerCase(name.charAt(index));
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return 1 + count(name, index + 1);
        return count(name, index + 1);
    }

    public static void main(String[] args) {
        String name = "education";
        System.out.println(count(name, 0));
    }
}