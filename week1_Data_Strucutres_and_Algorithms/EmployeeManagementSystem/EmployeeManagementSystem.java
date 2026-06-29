package week1_Data_Strucutres_and_Algorithms.EmployeeManagementSystem;

class Employee {

    int employeeId;
    String name;
    String position;
    double salary;

    Employee(int id, String name, String position, double salary) {
        this.employeeId = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String toString() {
        return employeeId + " " + name + " " + position + " " + salary;
    }
}

public class EmployeeManagementSystem {

    static Employee[] employees = new Employee[10];
    static int count = 0;

    static void addEmployee(Employee e) {
        employees[count++] = e;
    }

    static void searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                System.out.println(employees[i]);
                return;
            }
        }
        System.out.println("Employee Not Found");
    }

    static void traverseEmployees() {
        for (int i = 0; i < count; i++)
            System.out.println(employees[i]);
    }

    static void deleteEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == id) {

                for (int j = i; j < count - 1; j++)
                    employees[j] = employees[j + 1];

                employees[count - 1] = null;
                count--;
                return;
            }
        }
    }

    public static void main(String[] args) {

        addEmployee(new Employee(101, "Sai", "Developer", 50000));
        addEmployee(new Employee(102, "Tarun", "Manager", 70000));

        System.out.println("Employees:");
        traverseEmployees();

        System.out.println("\nSearch:");
        searchEmployee(101);

        deleteEmployee(102);

        System.out.println("\nAfter Delete:");
        traverseEmployees();
    }
}
