package InheritanceDemo.Polymorphism;

public class Addition {

    int a;
    int b;

    void add()
    {
        int c;
        c = a + b;
        System.out.println("c="+c);
    }

    void add(int x)
    {
        int c;
        c = x + b;
        System.out.println("c="+c);
    }

    void add(int x,int y)
    {
        int c;
        c = x + y;
        System.out.println("c="+c);
    }

    void add(int x,int y , int z)
    {
        int c;
        c = x + y + z;
        System.out.println("c="+c);
    }

    void add(String x,String y)
    {
        String c;
        c = x + y;
        System.out.println("c="+c);
    }

    void add(String x)
    {


        System.out.println("c="+x);
    }

    void add(int x,double y , int z)
    {
        double c;
        c = x + y + z;
        System.out.println("c="+c);
    }


    public static void main(String[] args) {
        Addition ob = new Addition();
        ob.add();
        ob.add(12);
        ob.add(12,23);
        ob.add(23,45,67);
        ob.add(23,45.67,67);
        ob.add("Amol","Java");
        ob.add("Amol");
    }
}
