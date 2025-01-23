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

    }
}
