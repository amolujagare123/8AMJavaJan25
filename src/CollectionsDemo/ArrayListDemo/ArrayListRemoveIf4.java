package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf4 {

    public static void main(String[] args) {

        ArrayList<Character> al = new ArrayList<>();

        for(char i='a' ; i<='z' ; i++)
        {
            al.add(i);
        }

        System.out.println(al);

        // remove all the vowels a,e,i,o,u

        al.removeIf(ch ->(ch=='a' || ch=='e' || ch=='i'||ch=='o'||ch=='u'));

        System.out.println(al);
    }
}
