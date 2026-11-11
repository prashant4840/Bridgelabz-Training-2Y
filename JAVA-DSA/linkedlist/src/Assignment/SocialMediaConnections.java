package BasicProblems;

import java.util.ArrayList;
import java.util.List;

class UserNode {
    int userId;
    String name;
    int age;
    List<Integer> friendIds;
    UserNode next;

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}

public class SocialMediaConnections {
    static UserNode head;
    static UserNode tail;

    static void insertUser(int userId, String name, int age) {
        UserNode temp = new UserNode(userId, name, age);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    static UserNode searchByUserId(int userId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    static UserNode searchByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    static void addFriendConnection(int userId1, int userId2) {
        UserNode u1 = searchByUserId(userId1);
        UserNode u2 = searchByUserId(userId2);
        if (u1 != null && u2 != null) {
            if (!u1.friendIds.contains(userId2)) {
                u1.friendIds.add(userId2);
            }
            if (!u2.friendIds.contains(userId1)) {
                u2.friendIds.add(userId1);
            }
        }
    }

    static void removeFriendConnection(int userId1, int userId2) {
        UserNode u1 = searchByUserId(userId1);
        UserNode u2 = searchByUserId(userId2);
        if (u1 != null && u2 != null) {
            u1.friendIds.remove(Integer.valueOf(userId2));
            u2.friendIds.remove(Integer.valueOf(userId1));
        }
    }

    static void findMutualFriends(int userId1, int userId2) {
        UserNode u1 = searchByUserId(userId1);
        UserNode u2 = searchByUserId(userId2);
        if (u1 != null && u2 != null) {
            System.out.print("Mutual friends between " + u1.name + " and " + u2.name + ": ");
            for (int fid : u1.friendIds) {
                if (u2.friendIds.contains(fid)) {
                    UserNode mutual = searchByUserId(fid);
                    if (mutual != null) {
                        System.out.print(mutual.name + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void displayFriends(int userId) {
        UserNode u = searchByUserId(userId);
        if (u != null) {
            System.out.println("Friends of " + u.name + ":");
            for (int fid : u.friendIds) {
                UserNode f = searchByUserId(fid);
                if (f != null) {
                    System.out.println("- " + f.name + " (ID: " + f.userId + ")");
                }
            }
        }
    }

    static void countFriendsAll() {
        UserNode temp = head;
        while (temp != null) {
            System.out.println("User: " + temp.name + " | Total Friends: " + temp.friendIds.size());
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        insertUser(1, "Alice", 20);
        insertUser(2, "Bob", 22);
        insertUser(3, "Charlie", 21);
        insertUser(4, "David", 23);

        addFriendConnection(1, 2);
        addFriendConnection(1, 3);
        addFriendConnection(4, 2);
        addFriendConnection(4, 3);

        displayFriends(1);
        countFriendsAll();
        findMutualFriends(1, 4);
    }
}
