package OOPS;

class Student {
    private int id;
    private String name;

    public int getId() { //getters
        return id;
    }

    public void setId(int d) { //setters
        this.id = d;

    }

    public String getName() { //getters
        return name;
    }

    public void setName(String n) { //setters
        this.name = n;
    }

}

public class Getters_Setters {
    public static void main(String[] args) {
        Student st = new Student(); // creating object for the Student class
        st.setId(45); // setting values
        st.setName("Abhay b"); // setting values
        System.out.println(" Student Name : " + st.getName()); // print - getting the values
        System.out.println(" Studnt id : " + st.getId());  // print - getting the values

    }

}
