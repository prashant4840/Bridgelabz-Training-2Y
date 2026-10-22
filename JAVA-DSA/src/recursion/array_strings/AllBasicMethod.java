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

    public static int countVowels(String name, int index) {
        if (index == name.length()) return 0;
        char ch = Character.toLowerCase(name.charAt(index));
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return 1 + countVowels(name, index + 1);
        return countVowels(name, index + 1);
    }

    public static int countCharacter(String name, char ch, int index) {
        if (index == name.length()) return 0;
        if (name.charAt(index) == ch)
            return 1 + countCharacter(name, ch, index + 1);
        return countCharacter(name, ch, index + 1);
    }

    public static void printNewLine(String name, int index) {
        if (index == name.length()) return;
        System.out.println(name.charAt(index));
        printNewLine(name, index + 1);
    }

    public static String removeLetter(String name, int index, char ch) {
        if (index == name.length()) return "";
        if (name.charAt(index) == ch)
            return removeLetter(name, index + 1, ch);
        return name.charAt(index) + removeLetter(name, index + 1, ch);
    }

    public static String replaceA(String name, int index) {
        if (index == name.length()) return "";
        char ch = name.charAt(index);
        if (ch == 'a') ch = 'b';
        return ch + replaceA(name, index + 1);
    }

    public static int stringLength(String name, int index) {
        if (index == name.length()) return 0;
        return 1 + stringLength(name, index + 1);
    }

    public static boolean compareStrings(String a, String b, int index) {
        if (index == a.length() && index == b.length()) return true;
        if (index >= a.length() || index >= b.length()) return false;
        if (a.charAt(index) != b.charAt(index)) return false;
        return compareStrings(a, b, index + 1);
    }

    public static String removeDuplicates(String name, int index, String small) {
        if (index == name.length()) return small;
        char ch = name.charAt(index);
        if (small.indexOf(ch) == -1) small += ch;
        return removeDuplicates(name, index + 1, small);
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) return -1;
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) return mid;
        if (target < arr[mid])
            return binarySearch(arr, target, start, mid - 1);
        return binarySearch(arr, target, mid + 1, end);
    }

    public static void main(String[] args) {
        String name = "prashant";

        System.out.print("Print: ");
        print(name, 0);
        System.out.print("\nReverse: ");
        reverse(name, 0);

        System.out.println("\nPalindrome: " + palindrome(name, 0, name.length() - 1));
        System.out.println("Vowels: " + countVowels(name, 0));
        System.out.println("Occurrences of a: " + countCharacter(name, 'a', 0));

        System.out.println("Characters on new lines:");
        printNewLine(name, 0);

        System.out.println("After removing a: " + removeLetter(name, 0, 'a'));
        System.out.println("Replace a with b: " + replaceA(name, 0));
        System.out.println("Length: " + stringLength(name, 0));
        System.out.println("Strings equal: " + compareStrings(name, "prashant", 0));
        System.out.println("Without duplicates: " + removeDuplicates(name, 0, ""));

        int[] arr = {10, 20, 30, 40, 50, 60};
        System.out.println("Binary search index: " + binarySearch(arr, 40, 0, arr.length - 1));
    }
}