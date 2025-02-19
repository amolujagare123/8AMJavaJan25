package CollectionsDemo.stackDemo;

import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        s.push("amol");
        s.push("rahul");
        s.push("vaishali");
        s.push("anushka");
        s.push("taniya");

        System.out.println(s);

        s.pop();
        System.out.println(s);
    }
}
