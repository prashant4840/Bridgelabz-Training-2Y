package recursion.array_strings;

public class RemoveChar {
    public static String remove(String name, int index, char ch, String small) {
        if (index == name.length()) return small;
        ch = name.charAt(index);
        if (ch != 'a') {
            small += ch;
        }
        return remove(name, index + 1, ch, small);
    }

    public static void main(String[] args) {
        String name = "abcda";
        char ch = ' ';
        String small = "";
        System.out.println(remove(name, 0,ch, small));

    }
}