package ClassNConstructors;

public class MyClass2 {
    int a;
    double d;
    char c;
    String str;

    MyClass2()
    {
           a = 13;
           d = 56.67;
           c = 'h';
           str = "java";
    }

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        MyClass2 ob = new MyClass2();

        ob.display();

        ob.a = 10;
        ob.d = 1.90;
        ob.c = 'j';
        ob.str = "String";

        ob.display();


    }
}
