package LinkedListvsArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList = new LinkedList<Integer>();
        ArrayList<Integer>arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for(int i = 0; i < 100000;i++){
            linkedList.add(i);
            arrayList.add(i);
        }
        startTime = System.nanoTime();
        linkedList.remove(99999);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList elapsed time: \t" + elapsedTime + " Ns");

        startTime = System.nanoTime();
        arrayList.remove(99999);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList elapsed time: \t" + elapsedTime + " Ns");
    }
}
