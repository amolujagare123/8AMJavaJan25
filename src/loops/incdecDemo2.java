package loops;

public class incdecDemo2 {

    public static void main(String[] args) {
         int a = 10;

        System.out.println(a); // 10
        System.out.println(a--);// 10
        System.out.println(a); // 9
        System.out.println(--a); // 8
        System.out.println(a);// 8

        /*a++ , a- - : first the statement is
        executed and then increment or decrement happens.

 - - a , ++a : first  the  increment or decrement happens
 then the statement is executed.*/
    }
}
