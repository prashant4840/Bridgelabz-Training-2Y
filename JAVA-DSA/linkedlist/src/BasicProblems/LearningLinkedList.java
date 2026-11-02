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

    public static void main(String[]args){
        insertAtEnd(10);
        insertAtStart(5);
        insertAtStart(1);

        System.out.print("Linked List: ");
        display();

        System.out.println("Number of node : " + countNodes()) ;

        System.out.println(search(5));
        System.out.println(search(15));
    }
}