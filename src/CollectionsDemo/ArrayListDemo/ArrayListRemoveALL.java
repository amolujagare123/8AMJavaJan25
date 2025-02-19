package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveALL {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();


        al.add("amol");
        al.add("rahul");
        al.add("rohit");
        al.add("vaibhav");
        al.add("pranav");

        System.out.println("al="+al);

        ArrayList<String> al2 = new ArrayList<>();

        al2.add("rohit");
        al2.add("vaibhav");
        al2.add("pranav");
        al2.add("ele1");
        al2.add("ele2");
        al2.add("ele2");

        System.out.println("al2="+al2);
        al2.removeAll(al);
        System.out.println("al2="+al2);
    }
}
