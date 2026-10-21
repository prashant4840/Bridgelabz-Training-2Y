package recursion.array_strings;

public class RemoveDuplicates {
    public static String remove(String name, int index, String small) {
        if (index == name.length()) return small;
        char ch = name.charAt(index);
        if (small.indexOf(ch) == -1)
            small = small + ch;
        return remove(name, index + 1, small);
    }

    public static void main(String[] args) {
        String name = "programming";
        System.out.println(remove(name, 0, ""));
    }
}