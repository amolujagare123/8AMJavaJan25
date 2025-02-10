package staticNFinal;

public class FinalDemo {

    final int speed = 200;

    void change()
    {
      //  speed = 300;
    }

    public static void main(String[] args) {
        FinalDemo ob = new FinalDemo();
        System.out.println(ob.speed);
    }
}
