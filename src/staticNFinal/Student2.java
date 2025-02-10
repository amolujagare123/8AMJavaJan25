package staticNFinal;

public class Student2 {
    int rno;
    String name;
    static String college =  "ITS";

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static  void myStaticMethod1()
    {
        System.out.println("myStaticMethod1");

      //  System.out.println("rno="+rno); // non-static not allowed
      //  System.out.println("name="+name); // non-static not allowed
        System.out.println("college="+college); // static allowed

        myStaticMethod2(); // static allowed
     //   display(); // non-static not allowed
       // nonStaticMethod(); // non-static not allowed

    }

    public static  void myStaticMethod2()
    {
        System.out.println("myStaticMethod2");


    }

     void nonStaticMethod()
    {
        System.out.println("nonStaticMethod");
        System.out.println("myStaticMethod1");

        System.out.println("rno="+rno); // non-static  allowed
        System.out.println("name="+name); // non-static  allowed
        System.out.println("college="+college); // static allowed

        myStaticMethod2(); // static allowed
        display(); // non-static  allowed
        nonStaticMethod(); // non-static  allowed
    }

    public static void main(String[] args) {

        Student2 s1 = new Student2();

        s1.myStaticMethod1();
        s1.myStaticMethod2();


        Student2.myStaticMethod1();
        Student2.myStaticMethod2();

        myStaticMethod1();
        myStaticMethod2();








    }
}
