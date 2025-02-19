package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf3 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();


        al.add("amol");
        al.add("rahul");
        al.add("rohit");
        al.add("vaibhav");
        al.add("pranav");

        System.out.println("al="+al);

        // remove names starts with r
        // remove names having length less than or equal to 5

        //  al.removeIf(a -> a.charAt(0) == 'r');
      //  al.removeIf(a -> a.startsWith("r"));
        al.removeIf(str -> str.length()<=5);

        System.out.println("al="+al);

    }
}
