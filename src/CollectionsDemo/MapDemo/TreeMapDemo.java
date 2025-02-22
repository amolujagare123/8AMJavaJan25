package CollectionsDemo.MapDemo;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer,String> tm = new TreeMap<>();

        tm.put(523, "Amol");
        tm.put(124, "Vaishali");
        tm.put(725, "Rachita");
        tm.put(226, "John");
        tm.put(827, "Emma");
        tm.put(28, "David");

        System.out.println("hm="+tm);



    }
}
