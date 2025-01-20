package Arrays;

public class ArrayStringDemo {

    public static void main(String[] args) {

        String[] stArr = new String[5];

        stArr[0] = "Shikant";
        stArr[1] = "Sony";
        stArr[2] = "Raviteja";
        stArr[3] = "Mishal";
        stArr[4] = "Shrinivas";

        System.out.println("for loop");

        for(int i=0;i< stArr.length;i++)
            System.out.println(stArr[i]);

        System.out.println("for each loop");

        for (String str : stArr)
            System.out.println(str);
    }
}
