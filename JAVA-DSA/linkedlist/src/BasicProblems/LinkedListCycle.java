package BasicProblems;

import java.util.*;
public class LinkedListCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node head = null;
        Node tail = null;

        Node[] arr = new Node[n];

        for (int i = 0; i < n; i++) {
            Node temp = new Node(sc.nextInt());
            arr[i] = temp;

            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        int pos = sc.nextInt();

        if (pos >= 0 && pos < n) {
            tail.next = arr[pos];
        }

        Node slow = head;
        Node fast = head;

        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        System.out.println(cycle);
    }
}