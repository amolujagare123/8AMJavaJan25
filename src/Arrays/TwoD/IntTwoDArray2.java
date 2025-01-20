package Arrays.TwoD;

public class IntTwoDArray2 {

    public static void main(String[] args) {

        int[][] arr = {
                {12,31,66},
                {22,32,56},
                {32,33,46},
                {42,34,36}
        };

        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
