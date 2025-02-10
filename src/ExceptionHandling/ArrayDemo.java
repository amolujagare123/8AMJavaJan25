package ExceptionHandling;

import java.io.FileInputStream;

public class ArrayDemo {

    public static void main(String[] args) {


        int[] a = new int[5];

      //  FileInputStream fis = new FileInputStream("");

      try {
            a[0] = 10;
            a[1] = 20;
            a[2] = 11;
            a[3] = 30;
            a[4] = 14;
            a[5] = 50;

         //   FileInputStream fis = new FileInputStream("");

        }
        catch (Exception e)
        {
            System.out.println("inside catch");
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            e.printStackTrace();
        }


        for (int x:a)
            System.out.println(x);

    }
}
