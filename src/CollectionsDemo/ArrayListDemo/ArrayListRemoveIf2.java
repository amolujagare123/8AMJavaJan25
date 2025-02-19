package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf2 {


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

        // remove all the numbers which are less than 50

        al.removeIf(a -> a<50);

        System.out.println("al="+al);

    }
}
