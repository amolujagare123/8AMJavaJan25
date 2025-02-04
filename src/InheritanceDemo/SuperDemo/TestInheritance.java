package InheritanceDemo.SuperDemo;

class Employee
{
    int salary = 35000;
    int a;
/*
    Employee()
    {
        salary = 5000;
        a = 22;
    }*/

   Employee(int sal)
    {
        salary = sal;
        a = 22;
    }
    void display()
    {
        System.out.println("display parent");
    }

    void empWork()
    {
        System.out.println("empWork");
    }

}

class Programmer extends Employee
{
    int bonus;
    int salary;

    Programmer()
    {
        super(10);
        bonus = 10000;
        salary = 20000;

    }

    void display()
    {
        System.out.println("display Child");
    }

    void programmerWork()
    {
        System.out.println("programmerWork");
    }

    void callMembers()
    {
        System.out.println("========= Salary =========");
        System.out.println("child sal="+salary);
        System.out.println("parent sal="+super.salary);
       // display();
       // super.display();
    }
}

/*class Tester extends Employee
{

}*/


public class TestInheritance {

    public static void main(String[] args) {

        Programmer p = new Programmer();

        System.out.println(p.bonus);
        p.programmerWork();

        System.out.println(p.salary);
        p.empWork();
        p.callMembers();

        System.out.println(p.a);


     /*   Tester t = new Tester();
        System.out.println(t.salary);*/




    }
}
