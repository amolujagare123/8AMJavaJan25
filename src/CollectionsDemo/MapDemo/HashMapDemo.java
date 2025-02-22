package CollectionsDemo.MapDemo;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap hm = new HashMap();
        hm.put(123, "Amol");
        hm.put(124, "Vaishali");
        hm.put(125, "Rachita");
        hm.put(126, "John");
        hm.put(127, "Emma");
        hm.put(128, "David");
        hm.put("Name", "Vaishali");  // String key, String value
        hm.put(125.5, "Rachita");    // Double key, String value
        hm.put(126, 98765);          // Integer key, Integer value
        hm.put("Age", 30);           // String key, Integer value
        hm.put(true, "BooleanKey");  // Boole

        System.out.println(hm);
    }
}
