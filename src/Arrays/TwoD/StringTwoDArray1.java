package Arrays.TwoD;

public class StringTwoDArray1 {

    public static void main(String[] args) {

        String[][] stArr = new String[4][3];

        stArr[0][0] = "Amit";    // Row 0, Column 0
        stArr[0][1] = "Priya";   // Row 0, Column 1
        stArr[0][2] = "Rahul";   // Row 0, Column 2

        stArr[1][0] = "Sneha";   // Row 1, Column 0
        stArr[1][1] = "Arjun";   // Row 1, Column 1
        stArr[1][2] = "Kavya";   // Row 1, Column 2

        stArr[2][0] = "Vikas";   // Row 2, Column 0
        stArr[2][1] = "Meena";   // Row 2, Column 1
        stArr[2][2] = "Rohit";   // Row 2, Column 2

        stArr[3][0] = "Anjali";  // Row 3, Column 0
        stArr[3][1] = "Varun";   // Row 3, Column 1
        stArr[3][2] = "Pooja";   // Row 3, Column 2

        for (int i = 0; i < stArr.length; i++) {
            for (int j = 0; j < stArr[0].length; j++) {
                System.out.print(stArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
