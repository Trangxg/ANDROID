package OOP.BTVN1.QLNV;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagerApp {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo 10 nhân viên
        employees.add(new Employee(1, "Nguyen Van A", 21, "Marketing", 001, 15000000));
        employees.add(new Employee(2, "Nguyen Van B", 25, "Sale", 002, 12000000));
        employees.add(new Employee(3, "Le Thi C", 40, "Operation", 003, 20000000));
        employees.add(new Employee(4, "Le Thu D", 21, "Research & Development", 001, 15000000));
        employees.add(new Employee(5, "Tran Thu E", 25, "Marketing", 002, 12000000));
        employees.add(new Employee(6, "Hoang Thi F", 40, "Sale", 003, 20000000));
        employees.add(new Employee(7, "Nguyen Gia G", 21, "IT", 001, 15000000));
        employees.add(new Employee(8, "Tran Thi H", 25, "IT", 002, 12000000));
        employees.add(new Employee(9, "Le Van I", 23, "HR", 003, 20000000));
        employees.add(new Employee(10, "Bui Thi K", 40, "HR", 003, 20000000));

        // Menu chính
        while (true) {
            System.out.println("\n\n--- Employee Manager Application ---");
            System.out.println("1. Display list of employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Delete employee");
            System.out.println("4. Exit");
            System.out.print("Enter your option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Bỏ qua ký tự '\n'

            switch (choice) {
                case 1:
                    // Display list of employees
                    for (Employee employee : employees) {
                        System.out.println(employee);
                    }
                    break;
                case 2:
                    // Add 
                    System.out.println("\nEnter new employee information:");
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Department: ");
                    String department = scanner.nextLine();

                    System.out.print("Code: ");
                    int code = scanner.nextInt();

                    System.out.print("salaryRate: ");
                    int salaryRate = scanner.nextInt();

                    Employee newEmployee = new Employee(id, name, age, department, code, salaryRate);
                    employees.add(newEmployee);

                    System.out.println("\t----->Add employee successfully!");
                    break;
                case 3: //delete
                    System.out.print("Enter the employee ID to delete: ");
                    int idToDelete = scanner.nextInt();
                    scanner.nextLine(); // Bỏ qua ký tự '\n'

                    boolean isDeleted = false;
                    for (int i = 0; i < employees.size(); i++) {
                        if (employees.get(i).getId() == idToDelete) {
                            employees.remove(i);
                            isDeleted = true;
                            break;
                        }
                    }

                    if (isDeleted) {
                        System.out.println("\t----->Delete employee successfully!");
                    } else {
                        System.out.println("\t-----> No employee found with ID: " + idToDelete);
                    }
                    break;
                }
            }
        }
}
