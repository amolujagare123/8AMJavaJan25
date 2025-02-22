package CollectionsDemo.MapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo4 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(123, "Amol");
        hm.put(124, "Vaishali");
        hm.put(125, "Rachita");
        hm.put(126, "John");
        hm.put(127, "Emma");
        hm.put(128, "David");

        System.out.println("hm="+hm);

         Set s = hm.keySet();
         Collection values = hm.values();
         Set entrySet =  hm.entrySet();

        System.out.println(s);
        System.out.println(values);
        System.out.println(entrySet);

    }
}
