package loops;

public class WhileLoopDemo3 {

    public static void main(String[] args) {

        // print a to z characters ( small letters )
        char ch = 'a';

        while (ch<='z')
        {
            System.out.println(ch);
          /*  int i = ch + 1;
            ch = (char) i;*/

            ch = (char) (ch + 1);
            // if you want to store one type of
            // value into another type
            // then use that type in round
            // brackets in front of the value to be stored
            // uts called type casting
        }

    }
}
