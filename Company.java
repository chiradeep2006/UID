// Superclass
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee: " + name + " | Salary: $" + salary);
    }
}

// Subclass
class Manager extends Employee {
    String department;

    // Constructor using 'super' to call the parent constructor
    Manager(String name, double salary, String department) {
        super(name, salary); 
        this.department = department;
    }

    // Method Overriding
    @Override
    void displayDetails() {
        // Calling the parent's version of displayDetails
        super.displayDetails(); 
        System.out.println("Role: Manager | Dept: " + department);
    }
}

public class Company {
    public static void main(String[] args) {
        // Creating a Manager object
        Manager mgr = new Manager("Alice", 95000, "Engineering");

        // This will call the overridden method in Manager
        mgr.displayDetails();
    }
}