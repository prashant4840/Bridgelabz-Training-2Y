package BasicProblems;

public class BasicLinkedList {

    static Node head;
    static Node tail;

    public static void main(String[] args) {

        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println("Trick 01:");
        System.out.print(a.data + " --> ");
        System.out.print(b.data + " --> ");
        System.out.print(c.data + " --> ");
        System.out.print(d.data + " --> ");
        System.out.print(e.data + " --> ");
        System.out.println(e.next);

        System.out.println("\nTrick 02:");
        System.out.println(a.data + " --> " + a.next.data + " --> "
                + a.next.next.data + " --> "
                + a.next.next.next.data + " --> "
                + a.next.next.next.next.data + " --> null");

        System.out.println("\nTrick 03 (For Loop):");
        Node temp1 = a;

        for (int i = 0; i < 5 && temp1 != null; i++) {
            System.out.print(temp1.data + " --> ");
            temp1 = temp1.next;
        }
        System.out.println("null");

        System.out.println("\nTrick 04 (While Loop):");
        Node temp2 = a;

        while (temp2 != null) {
            System.out.print(temp2.data + " --> ");
            temp2 = temp2.next;
        }
        System.out.println("null");

        System.out.println("\nTrick 05 (Using Method):");
        display(a);

        System.out.println("\nTrick 06 (Using Recursion):");
        displayRecursive(a);

        System.out.println("\n\nCreating Linked List Using Methods:");

        insertAtEnd(5);
        insertAtEnd(6);
        insertAtEnd(7);
        insertAtEnd(8);
        insertAtEnd(9);

        System.out.println("Insert At End:");
        display();

        insertAtStart(4);

        System.out.println("Insert At Start:");
        display();
    }

    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " --> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Display using recursion
    public static void displayRecursive(Node head) {
        if (head == null) {
            System.out.println("null");
            return;
        }

        System.out.print(head.data + " --> ");
        displayRecursive(head.next);
    }

    static void insertAtEnd(int value) {
        Node temp = new Node(value);

        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    static void insertAtStart(int value) {
        Node temp = new Node(value);

        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    static void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
