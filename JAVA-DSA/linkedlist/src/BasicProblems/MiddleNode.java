package BasicProblems;
import java.util.*;

public class MiddleNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {
            Node temp = new Node(sc.nextInt());

            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (slow != null) {
            System.out.println(slow.data);
        }
    }
}