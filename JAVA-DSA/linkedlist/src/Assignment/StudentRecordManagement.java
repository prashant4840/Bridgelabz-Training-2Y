<<<<<<< HEAD
package BasicProblems;
=======
package Assignment;
>>>>>>> 257d5da ([Prashant] linkedlist-assignment)

class StudentNode {
    int rollNumber;
    String name;
    int age;
    String grade;
    StudentNode next;

    StudentNode(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

public class StudentRecordManagement {
    static StudentNode head;
    static StudentNode tail;

    static void insertAtStart(int rollNumber, String name, int age, String grade) {
        StudentNode temp = new StudentNode(rollNumber, name, age, grade);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    static void insertAtEnd(int rollNumber, String name, int age, String grade) {
        StudentNode temp = new StudentNode(rollNumber, name, age, grade);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    static void insertAtPosition(int position, int rollNumber, String name, int age, String grade) {
        if (position <= 1 || head == null) {
            insertAtStart(rollNumber, name, age, grade);
            return;
        }
        StudentNode temp = new StudentNode(rollNumber, name, age, grade);
        StudentNode curr = head;
        int count = 1;
        while (curr != null && count < position - 1) {
            curr = curr.next;
            count++;
        }
        if (curr == null || curr.next == null) {
            insertAtEnd(rollNumber, name, age, grade);
        } else {
            temp.next = curr.next;
            curr.next = temp;
        }
    }

    static void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            return;
        }
        if (head.rollNumber == rollNumber) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return;
        }
        StudentNode curr = head;
        while (curr.next != null && curr.next.rollNumber != rollNumber) {
            curr = curr.next;
        }
        if (curr.next != null) {
            if (curr.next == tail) {
                tail = curr;
            }
            curr.next = curr.next.next;
        }
    }

    static StudentNode searchByRollNumber(int rollNumber) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    static void display() {
        StudentNode temp = head;
        while (temp != null) {
            System.out.println("Roll: " + temp.rollNumber + " | Name: " + temp.name + " | Age: " + temp.age + " | Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    static void updateGrade(int rollNumber, String newGrade) {
        StudentNode student = searchByRollNumber(rollNumber);
        if (student != null) {
            student.grade = newGrade;
        }
    }

    public static void main(String[] args) {
        insertAtEnd(101, "Alice", 20, "A");
        insertAtStart(100, "Bob", 19, "B");
        insertAtPosition(2, 102, "Charlie", 21, "A+");

        System.out.println("Student Records:");
        display();

        System.out.println("\nSearching Roll 102:");
        StudentNode found = searchByRollNumber(102);
        if (found != null) {
            System.out.println("Found: " + found.name + ", Grade: " + found.grade);
        }

        updateGrade(101, "A+");
        System.out.println("\nAfter Updating Grade for Roll 101:");
        display();

        deleteByRollNumber(100);
        System.out.println("\nAfter Deleting Roll 100:");
        display();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 257d5da ([Prashant] linkedlist-assignment)
