package BasicProblems;
import java.util.*;

public class InsertAtEnd {
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

        int value = sc.nextInt();

        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}