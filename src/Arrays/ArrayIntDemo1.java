package Arrays;

public class ArrayIntDemo1 {
    public static void main(String[] args) {

        int[] a = new int[5];
        a[0] =34;
        a[1] =55;
        a[2] =76;
        a[3] =89;
        a[4] =11;
        System.out.println(a[3]);
        System.out.println("length="+a.length);

        System.out.println("For loop ");
        for (int i=0; i<a.length ;i++)
            System.out.println(a[i]);

        System.out.println("For each loop ");

        for(int y:a)
            System.out.println(y);

    }
}
