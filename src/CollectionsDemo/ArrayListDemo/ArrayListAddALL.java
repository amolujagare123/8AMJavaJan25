package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListAddALL {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();


        al.add("amol");
        al.add("rahul");
        al.add("rohit");
        al.add("vaibhav");
        al.add("pranav");

        System.out.println("al="+al);

        ArrayList<String> al2 = new ArrayList<>();

        System.out.println("al2="+al2);

        al2.addAll(al);

        System.out.println("al2="+al2);


    }
}
