package AbstractionDemo;

public interface InterfaceDemo2 {

    void run();
    void start();
    void display();
}

interface Interface2
{
    void display();
}

class ChildInterface2 implements InterfaceDemo2,Interface2
{

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void display() {
        System.out.println("display");
    }

    public static void main(String[] args) {

        ChildInterface2 ob = new ChildInterface2();
        ob.display();

        InterfaceDemo2 i1 = new ChildInterface2();
        i1.display();

        Interface2 i2 = new ChildInterface2();
        i2.display();
    }
}
