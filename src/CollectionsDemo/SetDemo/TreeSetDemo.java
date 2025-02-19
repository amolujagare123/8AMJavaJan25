package CollectionsDemo.SetDemo;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet ts = new TreeSet();
        ts.add("amol");
        ts.add("rahul");
        ts.add("rohit");
        ts.add("vaibhav");
        ts.add("pranav");

        System.out.println(ts.add("vaibhav"));
        System.out.println(ts);
    }
}
