package staticNFinal;

/*final*/ class Employee
{
    int salary = 35000;

    void empWork()
    {
        System.out.println("empWork");
    }

    final void calculateSalary(int daysPresent)
    {
        salary = daysPresent * 1754;
        System.out.println("salary="+salary);
    }

}

class Programmer //extends Employee
{
    int bonus = 15000;

    //  void calculateSalary(int daysPresent)
   // @Override
     void calculateSalary(int daysPresent)
    {
       /* salary = daysPresent * 2500;
        System.out.println("salary="+salary);*/
    }

    void programmerWork()
    {
        System.out.println("programmerWork");
    }
}




public class TestInheritance {

    public static void main(String[] args) {

        Programmer p = new Programmer();

        System.out.println(p.bonus);
        p.programmerWork();

       /* System.out.println(p.salary);
        p.empWork();*/

       // p.calculateSalary(22);


       // Employee e = new Programmer(); // up casting


      //  e.calculateSalary(23); // overridden method




    }
}
