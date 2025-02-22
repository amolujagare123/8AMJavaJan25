package CollectionsDemo.MapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();

        lhm.put(123, "Amol");
        lhm.put(124, "Vaishali");
        lhm.put(125, "Rachita");
        lhm.put(126, "John");
        lhm.put(127, "Emma");
        lhm.put(128, "David");

        System.out.println("hm="+lhm);



    }
}
