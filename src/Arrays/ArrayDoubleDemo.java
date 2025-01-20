package Arrays;

public class ArrayDoubleDemo {

    public static void main(String[] args) {

        double[] d = new double[5];

        d[0] = 12.34;
        d[1] = 34.14;
        d[2] = 67.14;
        d[3] = 2.34;
        d[4] = 1.34;

        for(int i=0 ; i<d.length ; i++)
            System.out.println(d[i]);

        for (double x :d)
            System.out.println(x);
    }
}
