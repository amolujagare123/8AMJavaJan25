package Methods;

public class MethodsWithparameters {

    // no argument

    void display() {
        System.out.println("display");
    }

    // Single  argument
    void intArgDemo(int a) {
        System.out.println("display a=" + a);
    }

    // multiple arguments
    void intArgDemo2(int a, int b, int c) {
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
    }

    // Different arguments
    void argDemo3(int a, double b, String c) {
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
    }

    // single dimensional Array as an argument
    void printMyArray1(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }

    // 2 dimensional Array as an argument
    void printMyArray2(String[][] st) {
        for (int i = 0; i < st.length; i++) {
            for (int j = 0; j < st[0].length; j++) {
                System.out.print(st[i][j] + "\t");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {

        MethodsWithparameters ob = new MethodsWithparameters();
        ob.display();
        ob.intArgDemo(12);
        ob.intArgDemo2(12, 45, 88);
        ob.argDemo3(12, 67.45, "Text");

        int[] arr = {34, 56, 23, 66, 22, 23, 11, 24, 68};

        ob.printMyArray1(arr);
        String[][] stArr = {
                {"Amit", "Priya", "Rahul"},
                {"Sneha", "Arjun", "Kavya"},
                {"Vikas", "Meena", "Rohit"},
                {"Anjali", "Varun", "Pooja"}
        };

        ob.printMyArray2(stArr);

    }

}
