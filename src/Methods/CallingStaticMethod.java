package Methods;

import staticNFinal.Student2;


import static staticNFinal.Student2.myStaticMethod1;
import static staticNFinal.Student2.myStaticMethod2;

public class CallingStaticMethod {

    public static void main(String[] args) {

        Student2 s2 = new Student2();

        Student2.myStaticMethod1();

        myStaticMethod1();
        myStaticMethod2();


    }
}
