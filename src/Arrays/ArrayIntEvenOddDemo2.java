package Arrays;

public class ArrayIntEvenOddDemo2 {

    public static void main(String[] args) {

        int[] a = {23,45,67,11,2,3,67,78};

        // print only even numbers

        System.out.println("====For loop=====");
        for (int i=0;i<a.length;i++) {

            if(a[i]%2 == 0)
               System.out.println(a[i]);
        }


        System.out.println("====For each loop=====");
        for (int x:a) {
            if(x%2==0)
            System.out.println(x);
        }
    }
}
