package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemove2 {


    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();


        al.add(23);
        al.add(11);
        al.add(111);
        al.add(56);
        al.add(67);

        System.out.println("al="+al);
       // al.remove("vaibhav");


        Integer ii = 111;
        al.remove(ii);

        System.out.println("al="+al);

    }
}
