package Assignment;

class ProcessNode {
    int processId;
    int burstTime;
    int remainingTime;
    int priority;
    int waitingTime;
    int turnaroundTime;
    ProcessNode next;

    ProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
        this.next = null;
    }
}

public class RoundRobinScheduler {
    static ProcessNode head;
    static ProcessNode tail;

    static void insertAtEnd(int processId, int burstTime, int priority) {
        ProcessNode temp = new ProcessNode(processId, burstTime, priority);
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

    static void removeProcess(ProcessNode target) {
        if (head == null) {
            return;
        }
        if (head == tail && head == target) {
            head = null;
            tail = null;
            return;
        }
        ProcessNode currNode = head;
        ProcessNode prev = tail;
        do {
            if (currNode == target) {
                prev.next = currNode.next;
                if (currNode == head) {
                    head = currNode.next;
                }
                if (currNode == tail) {
                    tail = prev;
                }
                return;
            }
            prev = currNode;
            currNode = currNode.next;
        } while (currNode != head);
    }

    static void displayQueue() {
        if (head == null) {
            System.out.println("Queue is empty.");
            return;
        }
        ProcessNode temp = head;
        System.out.print("Active Queue: ");
        do {
            System.out.print("[P" + temp.processId + " (Rem: " + temp.remainingTime + ")] -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Head)");
    }

    static void simulate(int timeQuantum) {
        if (head == null) {
            return;
        }
        int currentTime = 0;
        ProcessNode currNode = head;
        int totalProcesses = 0;
        ProcessNode temp = head;
        do {
            totalProcesses++;
            temp = temp.next;
        } while (temp != head);

        double totalWaitingTime = 0;
        double totalTurnaroundTime = 0;

        System.out.println("--- Starting Simulation (Quantum = " + timeQuantum + ") ---");
        while (head != null) {
            displayQueue();
            int executeTime = Math.min(currNode.remainingTime, timeQuantum);
            currNode.remainingTime -= executeTime;
            currentTime += executeTime;

            ProcessNode nextNode = currNode.next;
            if (currNode.remainingTime == 0) {
                currNode.turnaroundTime = currentTime;
                currNode.waitingTime = currNode.turnaroundTime - currNode.burstTime;
                totalWaitingTime += currNode.waitingTime;
                totalTurnaroundTime += currNode.turnaroundTime;

                System.out.println("Process P" + currNode.processId + " completed. WT: " + currNode.waitingTime + ", TAT: " + currNode.turnaroundTime);
                removeProcess(currNode);
            }
            currNode = nextNode;
        }

        System.out.println("\n--- Scheduling Metrics ---");
        System.out.println("Average Waiting Time: " + (totalWaitingTime / totalProcesses));
        System.out.println("Average Turnaround Time: " + (totalTurnaroundTime / totalProcesses));
    }

    public static void main(String[] args) {
        insertAtEnd(1, 10, 2);
        insertAtEnd(2, 5, 1);
        insertAtEnd(3, 8, 3);

        simulate(3);
    }
}
