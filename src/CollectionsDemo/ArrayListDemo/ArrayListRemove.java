package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemove {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();


        al.add("amol");
        al.add("rahul");
        al.add("rohit");
        al.add("vaibhav");
        al.add("pranav");

        System.out.println("al="+al);

       // al.remove("vaibhav");
        al.remove(1);

        System.out.println("al="+al);

    }
}
