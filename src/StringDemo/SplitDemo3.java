package StringDemo;

public class SplitDemo3 {

    public static void main(String[] args) {
        String str = "Hey Baby you are so lovely";
        String[] stArr = str.split(" ");
        // print only the words that ends with 'y'
        for(int i=0;i< stArr.length ; i++)
        {
            String temp = stArr[i]; // you
            int l = temp.length(); //

            if(temp.charAt(l-1)=='y')
             System.out.println(stArr[i]);
        }
    }
}
