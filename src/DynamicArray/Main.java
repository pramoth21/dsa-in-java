package DynamicArray;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ArrayList<String>arrayList = new ArrayList<String>();

        DynamicArrayDemo dynamicArray = new DynamicArrayDemo(5);
       dynamicArray.add("A");
       dynamicArray.add("B");
       dynamicArray.add("C");
       dynamicArray.add("D");
       dynamicArray.add("E");
       dynamicArray.add("F");

       dynamicArray.insert(0,"x");
       dynamicArray.delete("A");
        System.out.println(dynamicArray.search("C"));

        System.out.println(dynamicArray);
        System.out.println("size: "+ dynamicArray.size);
        System.out.println("capacity: "+ dynamicArray.capacity);
        System.out.println("empty: "+dynamicArray.isEmpty());
    }
}
