package Instance_variable;

public class Employee {
    String name;   //instance variable
    int age;
    final  String department = "Research"; // can't change variable

    public void agefinder(){
        //instance variable

        String a= "adult"; //Local Varibale(Can't call out of method scope)
        String c= "Child";

        if (age > 18) {
            System.out.println("Adult");
        }else{
            System.out.println("Child");
        }
        }

    }


