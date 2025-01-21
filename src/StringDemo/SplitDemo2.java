package StringDemo;

public class SplitDemo2 {

    public static void main(String[] args) {
        String str = "Hello friends my name is raju";
        String[] stArr = str.split(" ");

        // print only the words whose length is less than 5

        for(int i=0;i< stArr.length ; i++)
        {
           if(stArr[i].length()<5)
             System.out.println(stArr[i]);
        }
    }
}
