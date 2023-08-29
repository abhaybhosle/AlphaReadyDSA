package OOPS;

class Employee {
    String name;
    int id;

    // Constructor:

    Employee() { // Non - Parametrized constructor
        System.out.println("Employee details");

    }

    Employee(Employee e1) { // copy constructor
        this.name = e1.name;
        this.id = e1.id;

    }

    // Parametrized constructor
    Employee(String name) {
        this.name = name;

    }

    Employee(int id) {
        this.id = id;

    }

}

public class Constructors {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Abhay Bhosle";
        e1.id = 23;

        System.out.println(e1.name);
        System.out.println(e1.id);

        Employee e2 = new Employee(e1);
        // e2.name="Aman";
        // e2.id=456;
        System.out.println(e2.name);
        System.out.println(e2.id);

    }

}
