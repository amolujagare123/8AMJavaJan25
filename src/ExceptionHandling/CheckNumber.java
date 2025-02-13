package ExceptionHandling;

public class CheckNumber {

    void checkingNumber(int i)
    {
        if(i>=1 && i<=10)
            System.out.println("We are safe");
        else {
            /*ArithmeticException exceptionObject = new ArithmeticException("We are in danger");
            throw exceptionObject;*/

            throw new ArithmeticException("We are in danger");
        }
    }

    public static void main(String[] args) {

        int a = 13 ;

        CheckNumber checkNumber = new CheckNumber();
        checkNumber.checkingNumber(a);

        System.out.println("a="+a);
        System.out.println("end of the program");


    }
}
