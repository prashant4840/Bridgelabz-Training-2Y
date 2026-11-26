package BasicProblems;

import java.util.*;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Demo2 {
    public static void main(String[] args) {

        Queue<Integer> q2 = new ArrayBlockingQueue<>(3);

//        q2.remove();
//        try {
//            q2.remove(40);
//        } catch (IllegalStateException e) {
//            System.out.println("Exception: " + e);
//        }

        q2.poll();

        System.out.println(q2);
    }
}