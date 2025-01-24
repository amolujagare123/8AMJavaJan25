package ClassNConstructors;

public class MyClass3 {
    int a;
    double d;
    char c;
    String str;

    // Parameterized constructor

    MyClass3(int a1,double d1,char c1,String str1)
    {
           a = a1;
           d = d1;
           c = c1;
           str = str1;
    }

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {



        MyClass3 ob = new MyClass3(23,45.67,'g',"Text");

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
