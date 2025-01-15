package loops;

public class incdecDemo1 {

    public static void main(String[] args) {
         int a = 10;

        System.out.println(a); // 10
        System.out.println(a++);// 10
        System.out.println(a); // 11
        System.out.println(++a); // 12
        System.out.println(a);// 12

        /*a++ , a- - : first the statement is
        executed and then increment or decrement happens.

 - - a , ++a : first  the  increment or decrement happens
 then the statement is executed.*/
    }
}
