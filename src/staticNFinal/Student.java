package staticNFinal;

public class Student {
    int rno;
    String name;
    static String college =  "ITS";

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }


    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.rno = 1;
        s1.name = "Shridhar";

        s2.rno = 2;
        s2.name = "Rajesh";
        s2.college = "Pune college";

        s3.rno = 3;
        s3.name = "Shridevi";


        Student.college = "PICT";



        s1.display();
        s2.display();
        s3.display();



    }
}
