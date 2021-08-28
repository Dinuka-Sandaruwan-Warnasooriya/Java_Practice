package Constructors;

public class Employee {
    String name;   //instance variable
    int age;
    String department;

    //default constructor
    Employee(){

        this.name="Employee";
        this.age =20;
        this.department ="IT";
    }

    //parametarized constructor
    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

   }
