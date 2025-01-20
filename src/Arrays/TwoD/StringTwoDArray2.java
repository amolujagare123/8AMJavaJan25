package Arrays.TwoD;

public class StringTwoDArray2 {

    public static void main(String[] args) {

         String[][] stArr = {
                {"Amit", "Priya", "Rahul"},    // Row 0
                {"Sneha", "Arjun", "Kavya"},   // Row 1
                {"Vikas", "Meena", "Rohit"},   // Row 2
                {"Anjali", "Varun", "Pooja"}   // Row 3
        };

        for (int i = 0; i < stArr.length; i++) {
            for (int j = 0; j < stArr[0].length; j++) {
                System.out.print(stArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
