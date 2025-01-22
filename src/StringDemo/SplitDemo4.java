package StringDemo;

public class SplitDemo4 {

    public static void main(String[] args) {
        String str = "Hey Baby you are so lovely";
        String[] stArr = str.split(" ");
        // print only the words that ends with 'y'
        for(int i=0;i< stArr.length ; i++)
        {
            String temp = stArr[i]; // you
           

            if(temp.endsWith("y"))
             System.out.println(stArr[i]);
        }
    }
}
