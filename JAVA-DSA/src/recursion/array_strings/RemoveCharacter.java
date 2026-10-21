package recursion.array_strings;

public class RemoveCharacter {
    public static String remove(String name, char ch, int index) {
        if (index == name.length()) return "";
        if (name.charAt(index) == ch)
            return remove(name, ch, index + 1);
        return name.charAt(index) + remove(name, ch, index + 1);
    }

    public static void main(String[] args) {
        String name = "banana";
        System.out.println(remove(name, 'a', 0));
    }
}