package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf {


    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();


        al.add(23);
        al.add(11);
        al.add(111);
        al.add(16);
        al.add(62);
        al.add(53);
        al.add(67);

        System.out.println("al="+al);

        // remove all the odd number

        al.removeIf(a -> a%2 !=0  );

        System.out.println("al="+al);

    }
}
