package Arrays;

public class ArrayStringDemo2 {

    public static void main(String[] args) {
        String[] stArr = { "Shikant", "Sony", "Raviteja", "Mishal", "Shrinivas", "Amit", "Pooja", "Rahul", "Anjali", "Vikas" };

        System.out.println("========= for loop =========");

        for(int i=0;i< stArr.length;i++)
            System.out.println(stArr[i]);

        System.out.println("========= for each loop =========" );

        for (String str : stArr)
            System.out.println(str);
    }
}
