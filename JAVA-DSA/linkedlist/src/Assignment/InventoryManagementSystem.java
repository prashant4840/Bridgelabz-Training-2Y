package BasicProblems;

class ItemNode {
    String itemName;
    int itemId;
    int quantity;
    double price;
    ItemNode next;

    ItemNode(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

public class InventoryManagementSystem {
    static ItemNode head;
    static ItemNode tail;

    static void insertAtStart(int itemId, String itemName, int quantity, double price) {
        ItemNode temp = new ItemNode(itemId, itemName, quantity, price);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    static void insertAtEnd(int itemId, String itemName, int quantity, double price) {
        ItemNode temp = new ItemNode(itemId, itemName, quantity, price);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    static void insertAtPosition(int position, int itemId, String itemName, int quantity, double price) {
        if (position <= 1 || head == null) {
            insertAtStart(itemId, itemName, quantity, price);
            return;
        }
        ItemNode temp = new ItemNode(itemId, itemName, quantity, price);
        ItemNode curr = head;
        int count = 1;
        while (curr != null && count < position - 1) {
            curr = curr.next;
            count++;
        }
        if (curr == null || curr.next == null) {
            insertAtEnd(itemId, itemName, quantity, price);
        } else {
            temp.next = curr.next;
            curr.next = temp;
        }
    }

    static void removeItemById(int itemId) {
        if (head == null) {
            return;
        }
        if (head.itemId == itemId) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return;
        }
        ItemNode curr = head;
        while (curr.next != null && curr.next.itemId != itemId) {
            curr = curr.next;
        }
        if (curr.next != null) {
            if (curr.next == tail) {
                tail = curr;
            }
            curr.next = curr.next.next;
        }
    }

    static void updateQuantity(int itemId, int newQuantity) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
    }

    static ItemNode searchById(int itemId) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    static ItemNode searchByName(String itemName) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(itemName)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    static double calculateTotalValue() {
        double total = 0;
        ItemNode temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        return total;
    }

    static void display() {
        ItemNode temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.itemId + " | Name: " + temp.itemName + " | Qty: " + temp.quantity + " | Price: $" + temp.price);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        insertAtEnd(101, "Laptop", 10, 800.0);
        insertAtStart(102, "Mouse", 50, 20.0);
        insertAtEnd(103, "Keyboard", 30, 45.0);

        System.out.println("Inventory List:");
        display();

        System.out.println("Total Inventory Value: $" + calculateTotalValue());

        updateQuantity(102, 60);
        System.out.println("\nAfter Quantity Update:");
        display();

        removeItemById(103);
        System.out.println("\nAfter Removing Keyboard:");
        display();
    }
}
