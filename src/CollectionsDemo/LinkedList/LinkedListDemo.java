package CollectionsDemo.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();
        ll.add("Samadhan");
        ll.add("Mishal");
        ll.add("Amol");
        ll.add("Sony");
        ll.add("Ananya");
        ll.add("Shri");

        System.out.println(ll);

        ll.addFirst("Vishlaxi");
        ll.addLast("Rahul");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);

    }
}
