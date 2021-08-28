package Instance_variable;

public class Main {
    public static void main(String[] args){
        Employee e1 =  new Employee(); //object creation

        e1.age = 25;
        e1.name = "Dinuka";

        e1.agefinder();
        System.out.println(e1.department);

    }

}
