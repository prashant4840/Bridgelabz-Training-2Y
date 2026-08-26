import java.util.*;

public class Leetcode_1389 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] index = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            index[i] = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
            list.add(index[i], nums[i]);

        int[] ans = new int[n];

        for (int i = 0; i < n; i++)
            ans[i] = list.get(i);

        System.out.println(Arrays.toString(ans));
    }
}