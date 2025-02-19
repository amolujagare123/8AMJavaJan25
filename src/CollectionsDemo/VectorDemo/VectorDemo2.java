package CollectionsDemo.VectorDemo;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo2 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("Samadhan");
        v.add("Mishal");
        v.add("Amol");
        v.add("Sony");
        v.add("Ananya");
        v.add("Shri");

        Enumeration e = v.elements();

        while (e.hasMoreElements())
            System.out.println(e.nextElement());

    }
}
