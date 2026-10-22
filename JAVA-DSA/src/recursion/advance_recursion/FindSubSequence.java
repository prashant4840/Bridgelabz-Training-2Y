package recursion.advance_recursion;
import java.util.*;

public class FindSubSequence {
    public static ArrayList<String> getSSQ(String s) {
        ArrayList<String> ans = new ArrayList<>();

        if (s.length() == 0) { ans.add("");
            return ans;
        }

        char ch = s.charAt(0);
        ArrayList<String> smallAns = getSSQ(s.substring(1));
        for (int i = 0; i < smallAns.size(); i++) {
            String ss = smallAns.get(i);
            ans.add(ss);
            ans.add(ch + ss);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(getSSQ(s));
    }
}