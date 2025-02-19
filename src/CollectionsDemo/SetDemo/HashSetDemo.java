package CollectionsDemo.SetDemo;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet hs = new HashSet();
        hs.add("amol");
        hs.add("rahul");
        hs.add("rohit");
        hs.add("vaibhav");
        hs.add("pranav");

        System.out.println(hs.add("vaibhav"));
        System.out.println(hs);
    }
}
