package CollectionsDemo.MapDemo;

import java.util.HashMap;

public class HashMapDemo3 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        System.out.println(hm.isEmpty());

        hm.put(123, "Amol");
        hm.put(124, "Vaishali");
        hm.put(125, "Rachita");
        hm.put(126, "John");
        hm.put(127, "Emma");
        hm.put(128, "David");

        System.out.println(hm.isEmpty());

        System.out.println("hm="+hm);

        System.out.println(hm.get(127));

        hm.remove(128);

        System.out.println("hm="+hm);

        System.out.println(hm.containsKey(125)); // true

        System.out.println(hm.containsValue("Vaishali")); // true

        hm.clear();
        System.out.println(hm);

    }
}
