package AbstractionDemo;

public abstract class Electronics {

    abstract void work();
    abstract void run();

    void myMethod()
    {
        System.out.println("myMethod");
    }

   /* public static void main(String[] args) {
        Electronics el = new Electronics();
    }*/
}

class HomeAppliances extends Electronics
{

    //@Override
    void work() {
        System.out.println("Work");
    }

   // @Override
    void run() {
        System.out.println("run");
    }

    public static void main(String[] args) {

        Electronics el = new HomeAppliances(); // upcasting
        el.work();
        el.run();
        el.myMethod();

    }
}
