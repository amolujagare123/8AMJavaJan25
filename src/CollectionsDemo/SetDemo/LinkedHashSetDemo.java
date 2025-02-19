package CollectionsDemo.SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet hs = new LinkedHashSet();
        hs.add("amol");
        hs.add("rahul");
        hs.add("rohit");
        hs.add("vaibhav");
        hs.add("pranav");

        System.out.println(hs.add("vaibhav"));
        System.out.println(hs);
    }
}
