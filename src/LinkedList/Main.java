package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String>linkedList = new LinkedList<String>();

        //linkedList.push("Softcore");
        //linkedList.push("blinding lights");
        //linkedList.push("sweet by psycho");
        //linkedList.push("outside");
        //linkedList.pop();
        //System.out.println(linkedList);

        //linkedList.offer("Softcore");
        //linkedList.offer("blinding lights");
        //linkedList.offer("sweet by psycho");
        //linkedList.offer("outside");
        //linkedList.poll();
        //System.out.println(linkedList);

        linkedList.add("Softcore");
        linkedList.add("blinding lights");
        linkedList.add("sweet but psycho");
        linkedList.add("outside");

        linkedList.remove("outside");
        System.out.println(linkedList.indexOf("sweet but psycho"));
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("Bad Romance");
        linkedList.addLast("Little Death");
        System.out.println(linkedList);

        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();
        System.out.println(last+ ", "+first);
    }
}
