package Arrays;

public class ArrayDoubleDemo2 {

    public static void main(String[] args) {

        double[] d = {12.45,23.45,34.56,45.67,56.78};

        System.out.println("====For loop=====");

        for(int i=0 ; i<d.length ; i++)
            System.out.println(d[i]);

        System.out.println("====For eachloop=====");
        for (double x :d)
            System.out.println(x);
    }
}
