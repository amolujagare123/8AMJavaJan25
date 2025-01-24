package ClassNConstructors;

public class MyClass4 {
    int a;
    double d;
    char c;
    String str;

    // Parameterized constructor with this operator

    MyClass4(int a, double d, char c, String str)
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    }

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {



        MyClass4 ob = new MyClass4(23,45.67,'g',"Text");

        ob.display();

     /*   ob.a = 10;
        ob.d = 1.90;
        ob.c = 'j';
        ob.str = "String";

        ob.display();*/

     /* int   aa = 13;
      double   dd = 56.67;
      char  cc = 'h';
      String  ss = "java";


        MyClass3 ob2 = new MyClass3(aa,dd,cc,ss);*/



    }
}
