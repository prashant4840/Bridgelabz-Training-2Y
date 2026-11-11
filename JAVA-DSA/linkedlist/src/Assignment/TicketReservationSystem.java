package BasicProblems;

class TicketNode {
    int ticketId;
    String customerName;
    String movieName;
    int seatNumber;
    String bookingTime;
    TicketNode next;

    TicketNode(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

public class TicketReservationSystem {
    static TicketNode head;
    static TicketNode tail;

    static void insertAtEnd(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
        TicketNode temp = new TicketNode(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = temp;
            tail = temp;
            temp.next = head;
        } else {
            tail.next = temp;
            tail = temp;
            tail.next = head;
        }
    }

    static void removeByTicketId(int ticketId) {
        if (head == null) {
            return;
        }
        TicketNode currNode = head;
        TicketNode prev = tail;
        do {
            if (currNode.ticketId == ticketId) {
                if (head == tail) {
                    head = null;
                    tail = null;
                } else {
                    prev.next = currNode.next;
                    if (currNode == head) {
                        head = currNode.next;
                    }
                    if (currNode == tail) {
                        tail = prev;
                    }
                }
                return;
            }
            prev = currNode;
            currNode = currNode.next;
        } while (currNode != head);
    }

    static void display() {
        if (head == null) {
            System.out.println("No reservations found.");
            return;
        }
        TicketNode temp = head;
        do {
            System.out.println("Ticket ID: " + temp.ticketId + " | Customer: " + temp.customerName + " | Movie: " + temp.movieName + " | Seat: " + temp.seatNumber + " | Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    static void searchByCustomerName(String name) {
        if (head == null) {
            return;
        }
        TicketNode temp = head;
        do {
            if (temp.customerName.equalsIgnoreCase(name)) {
                System.out.println("Found Reservation -> Ticket ID: " + temp.ticketId + " | Movie: " + temp.movieName + " | Seat: " + temp.seatNumber);
            }
            temp = temp.next;
        } while (temp != head);
    }

    static void searchByMovieName(String movie) {
        if (head == null) {
            return;
        }
        TicketNode temp = head;
        do {
            if (temp.movieName.equalsIgnoreCase(movie)) {
                System.out.println("Found Reservation -> Ticket ID: " + temp.ticketId + " | Customer: " + temp.customerName + " | Seat: " + temp.seatNumber);
            }
            temp = temp.next;
        } while (temp != head);
    }

    static int countNodes() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    public static void main(String[] args) {
        insertAtEnd(1001, "Alice", "Avatar 2", 12, "18:30");
        insertAtEnd(1002, "Bob", "Inception", 15, "19:00");
        insertAtEnd(1003, "Charlie", "Avatar 2", 13, "18:30");

        System.out.println("Booked Tickets:");
        display();

        System.out.println("\nTotal Booked Tickets: " + countNodes());

        System.out.println("\nSearching for Alice's Ticket:");
        searchByCustomerName("Alice");

        removeByTicketId(1002);
        System.out.println("\nAfter Removing Ticket 1002:");
        display();
    }
}
