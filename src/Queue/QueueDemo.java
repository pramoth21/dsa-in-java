package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Heavenly Delusional");
        queue.offer("Zom100");
        queue.offer("Fragment flower blooms");
        queue.offer("Class Room of elite");

        System.out.println("is queue is empty: " + queue.isEmpty());
        System.out.println("size of th line: " + queue.size());
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
