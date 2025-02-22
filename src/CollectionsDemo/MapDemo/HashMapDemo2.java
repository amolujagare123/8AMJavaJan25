package CollectionsDemo.MapDemo;

import java.util.HashMap;

public class HashMapDemo2 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(123, "Amol");
        hm.put(124, "Vaishali");
        hm.put(125, "Rachita");
        hm.put(126, "John");
        hm.put(127, "Emma");
        hm.put(128, "David");

        System.out.println("hm="+hm);

        HashMap<Integer,String> hm2 = new HashMap<>();
        System.out.println("hm2="+hm2);

        hm2.putAll(hm);
        System.out.println("hm2="+hm2);


    }
}
