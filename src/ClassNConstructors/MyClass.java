package ClassNConstructors;

public class MyClass {
    int a;
    double d;
    char c;
    String str;

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        int i ;
        i = 10;

        MyClass ob = new MyClass();
        ob.a = 10;
        ob.d = 1.90;
        ob.c = 'j';
        ob.str = "String";
        ob.display();

        MyClass ob2 = new MyClass();
        ob2.a = 100;
        ob2.d = 18.90;
        ob2.c = 'd';
        ob2.str = "Selenium";
        ob2.display();

    }
}
