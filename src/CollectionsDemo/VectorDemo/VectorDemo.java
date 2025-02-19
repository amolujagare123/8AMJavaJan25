package CollectionsDemo.VectorDemo;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        System.out.println("size="+v.size()); // 0
        System.out.println("Capacity="+v.capacity()); // 10

        v.add("Samadhan");
        v.add("Mishal");
        v.add("Amol");
        v.add("Sony");
        v.add("Ananya");
        v.add("Shri");
        v.add("Amol");
        v.add("Sony");
        v.add("Ananya");
        v.add("Shri");
        v.add("Shri");
        v.add("Amol");
        v.add("Sony");
        v.add("Ananya");
        v.add("Shri");
        v.add("Amol");
        v.add("Sony");
        v.add("Ananya");
        v.add("Shri");
        v.add("Shri");
        v.add("Shri");


        System.out.println("size="+v.size()); // 21
        System.out.println("Capacity="+v.capacity()); // 40

    }
}
