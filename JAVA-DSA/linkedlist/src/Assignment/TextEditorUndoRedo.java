<<<<<<< HEAD
package BasicProblems;
=======
package Assignment;
>>>>>>> 257d5da ([Prashant] linkedlist-assignment)

class StateNode {
    String textContent;
    StateNode prev;
    StateNode next;

    StateNode(String textContent) {
        this.textContent = textContent;
        this.prev = null;
        this.next = null;
    }
}

public class TextEditorUndoRedo {
    static StateNode head;
    static StateNode tail;
    static StateNode current;
    static int historySize = 0;
    static final int MAX_CAPACITY = 10;

    static void addState(String content) {
        StateNode temp = new StateNode(content);
        if (head == null) {
            head = temp;
            tail = temp;
            current = temp;
            historySize = 1;
            return;
        }

        current.next = temp;
        temp.prev = current;
        tail = temp;
        current = temp;

        StateNode scan = head;
        int count = 0;
        while (scan != null) {
            count++;
            scan = scan.next;
        }
        historySize = count;

        if (historySize > MAX_CAPACITY) {
            head = head.next;
            head.prev = null;
            historySize--;
        }
    }

    static void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo performed. Current State: \"" + current.textContent + "\"");
        } else {
            System.out.println("Cannot undo further.");
        }
    }

    static void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo performed. Current State: \"" + current.textContent + "\"");
        } else {
            System.out.println("Cannot redo further.");
        }
    }

    static void displayCurrentState() {
        if (current != null) {
            System.out.println("Active Text: \"" + current.textContent + "\"");
        } else {
            System.out.println("Editor is empty.");
        }
    }

    public static void main(String[] args) {
        addState("Hello");
        addState("Hello World");
        addState("Hello World!");

        displayCurrentState();

        undo();
        undo();
        redo();

        addState("Hello World Java");
        displayCurrentState();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 257d5da ([Prashant] linkedlist-assignment)
