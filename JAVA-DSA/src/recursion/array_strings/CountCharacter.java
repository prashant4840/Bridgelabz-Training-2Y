package recursion.array_strings;

public class CountCharacter {
    public static int count(String name, char ch, int index) {
        if (index == name.length()) return 0;
        if (name.charAt(index) == ch)
            return 1 + count(name, ch, index + 1);
        return count(name, ch, index + 1);
    }

    public static void main(String[] args) {
        String name = "banana";
        char ch = 'a';
        System.out.println(count(name, ch, 0));
    }
}