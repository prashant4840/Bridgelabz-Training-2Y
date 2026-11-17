import java.util.Stack;

class LC682 {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            String number = operations[i];
            if (number.equals("+")) {

                int val1 = st.pop();
                int val2 = st.pop();
                int newVal = val1 + val2;

                st.push(val2);
                st.push(val1);
                st.push(newVal);

            }
            else if (number.equals("C")) {
                st.pop();
            }
            else if (number.equals("D")) {
                st.push(2 * st.peek());
            }
            else {
                st.push(Integer.parseInt(number));
            }
        }

        int totalValue = 0;

        while (st.size() > 0) {
            totalValue += st.pop();
        }
        return totalValue;
    }
}