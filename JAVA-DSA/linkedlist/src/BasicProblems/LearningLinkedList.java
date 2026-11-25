package BasicProblems;

public class LearningLinkedList {
    static Node head;
    static Node tail;

    static void insertAtEnd(int value){
        Node temp=new Node(value);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
    }

    static void insertAtStart(int value){
        Node temp=new Node(value);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
            temp.next=head;
            head=temp;
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

    public static int countNodes(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public static boolean search(int value){
        Node temp=head;
        while(temp!=null){
            if(temp.data==value){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    public static Node findMid(){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static Node deleteFirst(Node head) {
        if (head == null) {
            return null;
        }
        head = head.next;
        return head;
    }

    public static void deleteLast() {
        if (head == null || head.next == null) {
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }



    public static void main(String[]args){
        insertAtEnd(10);
        insertAtStart(5);
        insertAtStart(1);

        System.out.print("Linked List: ");
        display();

        System.out.println("Number of node : " + countNodes()) ;

        System.out.println(search(5));
        System.out.println(search(15));

        Node mid = findMid();
        System.out.println("Middle index : " + mid.data);

        head = reverse(head);
        System.out.print("Reverse LinkedList : ");
        display();

        System.out.println("After deleting first node:");
        head = deleteFirst(head);
        display();

        System.out.println("After deleting last node:");
        deleteLast();
        display();

    }
}