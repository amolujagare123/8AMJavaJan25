package WrapperClass;

public class WrapperClassDemo {

    public static void main(String[] args) {

        int a = 10;
        System.out.println("a="+a);

     //   Integer ii = new Integer(a);

        Integer ii1 = a;
        Integer ii2 = 5; // auto boxing / auto wrapping

        System.out.println("ii1="+ii1);
        System.out.println("ii2="+ii2);

        int b1 = ii2.intValue(); // unboxing / unwrapping

        System.out.println("b1="+b1);

        int b2 = ii2; // auto unboxing / auto unwrapping

        System.out.println("b2="+b2);




    }
}
