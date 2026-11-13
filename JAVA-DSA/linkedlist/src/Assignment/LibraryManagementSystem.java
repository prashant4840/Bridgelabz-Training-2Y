package Assignment;

class BookNode {
    String bookTitle;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;
    BookNode prev;
    BookNode next;

    BookNode(int bookId, String bookTitle, String author, String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.prev = null;
        this.next = null;
    }
}

public class LibraryManagementSystem {
    static BookNode head;
    static BookNode tail;

    static void insertAtStart(int bookId, String bookTitle, String author, String genre, boolean isAvailable) {
        BookNode temp = new BookNode(bookId, bookTitle, author, genre, isAvailable);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    static void insertAtEnd(int bookId, String bookTitle, String author, String genre, boolean isAvailable) {
        BookNode temp = new BookNode(bookId, bookTitle, author, genre, isAvailable);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    static void insertAtPosition(int position, int bookId, String bookTitle, String author, String genre, boolean isAvailable) {
        if (position <= 1 || head == null) {
            insertAtStart(bookId, bookTitle, author, genre, isAvailable);
            return;
        }
        BookNode curr = head;
        int count = 1;
        while (curr != null && count < position) {
            curr = curr.next;
            count++;
        }
        if (curr == null) {
            insertAtEnd(bookId, bookTitle, author, genre, isAvailable);
        } else {
            BookNode temp = new BookNode(bookId, bookTitle, author, genre, isAvailable);
            temp.prev = curr.prev;
            temp.next = curr;
            if (curr.prev != null) {
                curr.prev.next = temp;
            }
            curr.prev = temp;
        }
    }

    static void removeByBookId(int bookId) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    head = temp.next;
                }
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                } else {
                    tail = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
    }

    static void searchByTitle(String title) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookTitle.equalsIgnoreCase(title)) {
                System.out.println("ID: " + temp.bookId + " | Title: " + temp.bookTitle + " | Author: " + temp.author + " | Available: " + temp.isAvailable);
            }
            temp = temp.next;
        }
    }

    static void searchByAuthor(String author) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                System.out.println("ID: " + temp.bookId + " | Title: " + temp.bookTitle + " | Author: " + temp.author + " | Available: " + temp.isAvailable);
            }
            temp = temp.next;
        }
    }

    static void updateAvailability(int bookId, boolean status) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = status;
                return;
            }
            temp = temp.next;
        }
    }

    static void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.bookId + " | Title: " + temp.bookTitle + " | Author: " + temp.author + " | Status: " + (temp.isAvailable ? "Available" : "Checked Out"));
            temp = temp.next;
        }
    }

    static void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            System.out.println("ID: " + temp.bookId + " | Title: " + temp.bookTitle + " | Author: " + temp.author + " | Status: " + (temp.isAvailable ? "Available" : "Checked Out"));
            temp = temp.prev;
        }
    }

    static int countNodes() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        insertAtEnd(1, "Clean Code", "Robert C. Martin", "Software", true);
        insertAtStart(2, "Data Structures in Java", "Mark Allen", "Tech", true);
        insertAtEnd(3, "Design Patterns", "Erich Gamma", "Software", false);

        System.out.println("Library Catalog (Forward):");
        displayForward();

        System.out.println("\nTotal Books in Library: " + countNodes());

        updateAvailability(3, true);
        System.out.println("\nAfter Updating Availability for Book 3:");
        displayForward();

        removeByBookId(2);
        System.out.println("\nAfter Removing Book 2:");
        displayForward();
    }
}
