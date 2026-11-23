package BasicsProblems;

import java.util.Stack;
public class SimpleDecreasingStack {
    public static void main(String[] args) {
        int[] nums = {5, 3, 4, 2, 6};
        Stack<Integer> stack = new Stack<>();

        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num) {
                stack.pop();
            }
            stack.push(num);
        }

        System.out.println("Decreasing Stack: " + stack);
        System.out.println("Minimum element: " + stack.peek());
    }
}
