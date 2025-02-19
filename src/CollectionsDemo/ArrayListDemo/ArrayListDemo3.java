package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();


        al.add("amol");
        al.add("rahul");
        al.add("rohit");
        al.add("vaibhav");
        al.add("pranav");

        System.out.println(al);

        al.set(2,"Atishi");

        System.out.println(al);

    }
}
