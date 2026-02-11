




class Employee {
    String name;

    void showName() {
        System.out.println("Employee Name: " + name);
    }
}

public class Default {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Rahul";
        e.showName();
    }
}



