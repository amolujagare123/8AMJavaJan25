package AbstractionDemo;

public interface InterfaceDemo1 {

    void run();
    void start();

    static void display1()
    {
        System.out.println("display1");
    }

    default void display2()
    {
        System.out.println("display2");
    }

    private void display3()
    {
        System.out.println("display3");
    }

}

class ChildInterface1 implements InterfaceDemo1
{
    public void run()
    {
        System.out.println("run");
    }

    public void start()
    {
        System.out.println("start");
    }
}
