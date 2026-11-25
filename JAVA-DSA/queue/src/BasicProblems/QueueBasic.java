package BasicProblems;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueBasic{
   public static void main(String[] args) {

      Queue<Integer> queue=new PriorityQueue<>() ;

  	  queue.add(30);
      queue.add(15);
      queue.add(20);
	  queue.add(10);
	  queue.add(2);

      System.out.println(queue);
   }
}

