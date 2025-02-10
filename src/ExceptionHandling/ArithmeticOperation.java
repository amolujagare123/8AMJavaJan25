package ExceptionHandling;

public class ArithmeticOperation {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c=0;

        try {
            c = a / b;
         }
         catch (Exception e)
         {
             System.out.println("inside the exception");
         }


        System.out.println("c="+c);
        System.out.println("end of the program");
    }
}
