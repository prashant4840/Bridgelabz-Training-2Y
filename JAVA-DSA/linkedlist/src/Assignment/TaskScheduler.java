<<<<<<< HEAD
package BasicProblems;
=======
package Assignment;
>>>>>>> 257d5da ([Prashant] linkedlist-assignment)

class TaskNode {
    int taskId;
    String taskName;
    String priority;
    String dueDate;
    TaskNode next;

    TaskNode(int taskId, String taskName, String priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

public class TaskScheduler {
    static TaskNode head;
    static TaskNode tail;
    static TaskNode current;

    static void insertAtStart(int taskId, String taskName, String priority, String dueDate) {
        TaskNode temp = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = temp;
            tail = temp;
            current = temp;
            temp.next = temp;
        } else {
            temp.next = head;
            head = temp;
            tail.next = head;
        }
    }

    static void insertAtEnd(int taskId, String taskName, String priority, String dueDate) {
        TaskNode temp = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = temp;
            tail = temp;
            current = temp;
            temp.next = temp;
        } else {
            tail.next = temp;
            tail = temp;
            tail.next = head;
        }
    }

    static void insertAtPosition(int position, int taskId, String taskName, String priority, String dueDate) {
        if (position <= 1 || head == null) {
            insertAtStart(taskId, taskName, priority, dueDate);
            return;
        }
        TaskNode temp = new TaskNode(taskId, taskName, priority, dueDate);
        TaskNode currNode = head;
        int count = 1;
        while (count < position - 1 && currNode.next != head) {
            currNode = currNode.next;
            count++;
        }
        if (currNode == tail) {
            insertAtEnd(taskId, taskName, priority, dueDate);
        } else {
            temp.next = currNode.next;
            currNode.next = temp;
        }
    }

    static void removeByTaskId(int taskId) {
        if (head == null) {
            return;
        }
        TaskNode currNode = head;
        TaskNode prev = tail;
        do {
            if (currNode.taskId == taskId) {
                if (head == tail) {
                    head = null;
                    tail = null;
                    current = null;
                } else {
                    prev.next = currNode.next;
                    if (currNode == head) {
                        head = currNode.next;
                    }
                    if (currNode == tail) {
                        tail = prev;
                    }
                    if (currNode == current) {
                        current = currNode.next;
                    }
                }
                return;
            }
            prev = currNode;
            currNode = currNode.next;
        } while (currNode != head);
    }

    static void viewAndMoveNext() {
        if (current == null) {
            System.out.println("No tasks available.");
            return;
        }
        System.out.println("Current Task: ID: " + current.taskId + " | Name: " + current.taskName + " | Priority: " + current.priority);
        current = current.next;
    }

    static void display() {
        if (head == null) {
            System.out.println("No tasks in scheduler.");
            return;
        }
        TaskNode temp = head;
        do {
            System.out.println("Task ID: " + temp.taskId + " | Name: " + temp.taskName + " | Priority: " + temp.priority + " | Due: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    static void searchByPriority(String priority) {
        if (head == null) {
            return;
        }
        TaskNode temp = head;
        do {
            if (temp.priority.equalsIgnoreCase(priority)) {
                System.out.println("Found Task: " + temp.taskName + " (ID: " + temp.taskId + ")");
            }
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        insertAtEnd(1, "Fix Bug #101", "High", "2026-11-15");
        insertAtStart(2, "Code Review", "Medium", "2026-11-12");
        insertAtEnd(3, "Database Backup", "High", "2026-11-20");

        System.out.println("All Tasks:");
        display();

        System.out.println("\nExecuting Tasks Circularly:");
        viewAndMoveNext();
        viewAndMoveNext();

        System.out.println("\nHigh Priority Tasks:");
        searchByPriority("High");

        removeByTaskId(2);
        System.out.println("\nAfter Removing Task 2:");
        display();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 257d5da ([Prashant] linkedlist-assignment)
