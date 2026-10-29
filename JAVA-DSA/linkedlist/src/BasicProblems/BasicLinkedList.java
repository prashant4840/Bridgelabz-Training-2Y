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

         System.out.print(a.data + " -- > " +a.next.data + " --> " + a.next.next.data + " --> "
                 + a.next.next.next.data + " --> " + a.next.next.next.next.data + " --> " + e.next);

     }
}

