package Methods;

public class MethodsReturningValues {

    int getMyValue()
    {
        int a = 10;
        return a;
    }

    double getMyDoubleValue()
    {
        double d = 89.33;
        return d;
    }

    char getMyCharValue()
    {
        char c = 'h';
        return c;
    }

    String reverseString(String str)
    {
        String temp="";

        for (int i=str.length()-1;i>=0;i--)
        {
            temp = temp + str.charAt(i);
        }

        return temp;
    }

    int[] getMyArray()
    {
        int[] arr = {34,45,56,67,89,78,90,11,22,33};

        return arr;
    }

    String[][] getMyTwoDArray()
    {
        String[][] cities = {
                {"Mumbai", "Delhi", "Bangalore", "Hyderabad", "Ahmedabad"},
                {"Chennai", "Kolkata", "Pune", "Jaipur", "Lucknow"},
                {"Surat", "Kanpur", "Nagpur", "Indore", "Thane"},
                {"Bhopal", "Visakhapatnam", "Patna", "Vadodara", "Ghaziabad"}
        };

        return cities;
    }

    public static void main(String[] args) {

        int x;
        x = 11 ;
        System.out.println(x);
        int y;
        y = x;
        System.out.println(y);

        MethodsReturningValues ob = new MethodsReturningValues();

        int var = ob.getMyValue();

        System.out.println(ob.getMyValue());

        System.out.println(ob.reverseString("Mishal"));


        int[] myArr = ob.getMyArray();
        for (int ar:myArr)
            System.out.println(ar);


        String[][] stArr = ob.getMyTwoDArray();

        System.out.println("Print my 2 D array");




        for (int i=0;i< stArr.length ; i++)  {
            for (int j=0;j< stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+"\t\t");
            }
            System.out.println();
        }
    }
}
