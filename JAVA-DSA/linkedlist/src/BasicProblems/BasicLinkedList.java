package BasicProblems;

public class BasicLinkedList {
     public static void main(String[] args){


         Node a = new Node(5);
         Node b = new Node(6);
         Node c = new Node(7);
         Node d = new Node(8);
         Node e = new Node(9);

         a.next = b;
         b.next = c;
         c.next = d;
         d.next = e;

         System.out.println("Trick 01 : ");

         System.out.print(a.data + " --> ");
         System.out.print(b.data + " --> ");
         System.out.print(c.data + " --> ");
         System.out.print(d.data + " --> ");
         System.out.print(e.data + " --> ");
         System.out.println(e.next);

         System.out.println("Trick 02 :");
         System.out.print(a.data + " --> ");
         System.out.print(a.next.data + " --> ");
         System.out.print(a.next.next.data + " -- > ");
         System.out.print(a.next.next.next.data + " --> ");
         System.out.print(a.next.next.next.next.data + " --> ");
         System.out.println(e.next);

         System.out.println("Trick 02 (in one go) : ");

         System.out.println(a.data + " -- > " +a.next.data + " --> " + a.next.next.data + " --> "
                 + a.next.next.next.data + " --> " + a.next.next.next.next.data + " --> " + e.next);


         System.out.println("Trick 03 (with help of for loop):");
         Node temp1=a;
         for(int i=0;i<5&&temp1!=null;i++){
             System.out.print(temp1.data+" --> ");
             temp1=temp1.next;
         }

         System.out.println();
         System.out.println("Trick 04 (with help of while loop):");
         Node temp2=a;
         while(temp2!=null){
             System.out.print(temp2.data+" --> ");
             temp2=temp2.next;

         }

         System.out.println();
         System.out.println("Trick 05 (using method):");
         display(a);


         System.out.println();
         System.out.println("Trick 06 (using recursion)");
     }

    public static void display(Node head){
        while(head !=null){
            System.out.print(head.data+" --> ");
            head=head.next;
        }
    }
}

