package BasicProblems;

import java.util.*;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Demo1 {
    public static void main(String[] args) {

        Queue<Integer> q1 = new ArrayBlockingQueue<>(3);

        q1.add(30);
        q1.add(15);
        q1.add(20);

//        try {
//            q1.add(40);
//        } catch (IllegalStateException e) {
//            System.out.println("Exception: " + e);
//        }

        q1.offer(40);

        System.out.println(q1);
    }
}