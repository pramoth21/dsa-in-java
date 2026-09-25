package PriorityQueue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        Queue<String>queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("A");
        queue.offer("C");
        queue.offer("F");
        queue.offer("B");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
