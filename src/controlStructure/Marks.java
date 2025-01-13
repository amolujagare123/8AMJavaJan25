package controlStructure;

public class Marks {


    public static void main(String[] args) {

        int marks = 111;

        if(marks>=1 && marks<=100) {
            if (marks < 40)
                System.out.println("fail");

            if (marks >= 40 && marks < 50)
                System.out.println("pass");

            if (marks >= 50 && marks < 60)
                System.out.println("second class");

            if (marks >= 60 && marks < 70)
                System.out.println("First class");

            if (marks >= 70)
                System.out.println("Distinction");
        }
        else
            System.out.println("print valid value");
    }
}
