<<<<<<< HEAD
package BasicProblems;
=======
package Assignment;
>>>>>>> 257d5da ([Prashant] linkedlist-assignment)

class MovieNode {
    String title;
    String director;
    int year;
    double rating;
    MovieNode prev;
    MovieNode next;

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}

public class MovieManagementSystem {
    static MovieNode head;
    static MovieNode tail;

    static void insertAtStart(String title, String director, int year, double rating) {
        MovieNode temp = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    static void insertAtEnd(String title, String director, int year, double rating) {
        MovieNode temp = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    static void insertAtPosition(int position, String title, String director, int year, double rating) {
        if (position <= 1 || head == null) {
            insertAtStart(title, director, year, rating);
            return;
        }
        MovieNode curr = head;
        int count = 1;
        while (curr != null && count < position) {
            curr = curr.next;
            count++;
        }
        if (curr == null) {
            insertAtEnd(title, director, year, rating);
        } else {
            MovieNode temp = new MovieNode(title, director, year, rating);
            temp.prev = curr.prev;
            temp.next = curr;
            if (curr.prev != null) {
                curr.prev.next = temp;
            }
            curr.prev = temp;
        }
    }

    static void removeByTitle(String title) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
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

    static void searchByDirector(String director) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                System.out.println("Title: " + temp.title + " | Director: " + temp.director + " | Year: " + temp.year + " | Rating: " + temp.rating);
            }
            temp = temp.next;
        }
    }

    static void searchByRating(double rating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.rating == rating) {
                System.out.println("Title: " + temp.title + " | Director: " + temp.director + " | Year: " + temp.year + " | Rating: " + temp.rating);
            }
            temp = temp.next;
        }
    }

    static void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            System.out.println("Title: " + temp.title + " | Director: " + temp.director + " | Year: " + temp.year + " | Rating: " + temp.rating);
            temp = temp.next;
        }
    }

    static void displayReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            System.out.println("Title: " + temp.title + " | Director: " + temp.director + " | Year: " + temp.year + " | Rating: " + temp.rating);
            temp = temp.prev;
        }
    }

    static void updateRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        insertAtEnd("Inception", "Nolan", 2010, 8.8);
        insertAtStart("Interstellar", "Nolan", 2014, 8.6);
        insertAtPosition(2, "The Dark Knight", "Nolan", 2008, 9.0);

        System.out.println("Movies (Forward):");
        displayForward();

        System.out.println("\nMovies (Reverse):");
        displayReverse();

        updateRating("Inception", 9.1);
        System.out.println("\nAfter Updating Rating for Inception:");
        displayForward();

        removeByTitle("Interstellar");
        System.out.println("\nAfter Removing Interstellar:");
        displayForward();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 257d5da ([Prashant] linkedlist-assignment)
