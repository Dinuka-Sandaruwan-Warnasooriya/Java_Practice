package Constructors;

public class Main {
    public static void main(String[] args){

        //default constructor
        Employee e1= new Employee();
        System.out.println(e1.name);
        System.out.println(e1.age);

        //parametarized constructor
        Employee e2 =new Employee("Dinuka",25,"IT");
        System.out.println(e2.name);
        System.out.println(e2.age);

    }
}
