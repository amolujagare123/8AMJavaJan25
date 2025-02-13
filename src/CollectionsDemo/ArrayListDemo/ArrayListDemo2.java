package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("rahul");
        al.add("rohit");
        al.add("vaibhav");
        al.add("pranav");


        System.out.println(al.get(4));

        System.out.println(al);

        System.out.println("size="+al.size());

        System.out.println("Using for loop");

        for(int i=0 ; i<al.size() ; i++)
            System.out.println(al.get(i));

        System.out.println("Using for each loop ");

        for (String str : al)
            System.out.println(str);

        System.out.println("Using Iterator");

        Iterator itr = al.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
