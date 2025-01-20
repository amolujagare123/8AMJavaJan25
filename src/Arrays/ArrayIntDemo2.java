package Arrays;

public class ArrayIntDemo2 {

    public static void main(String[] args) {

        int[] a = {23,45,67,11,2,3,67,78};

        System.out.println("====For loop=====");
        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);

        System.out.println("====For each loop=====");
        for (int x:a)
            System.out.println(x);

    }
}
