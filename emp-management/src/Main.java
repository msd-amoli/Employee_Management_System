import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeService(10);
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Employee Management System ===");
            System.out.println("1. Add Employee");
            System.out.println("2. Add Manager");
            System.out.println("3. Update Employee");
            System.out.println("4. Search Employee");
            System.out.println("5. Display All Employees");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter Address: ");
                    String address = input.nextLine();

                    System.out.print("Enter Age: ");
                    int age = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = input.nextDouble();
                    input.nextLine();

                    System.out.print("Enter Designation: ");
                    String designation = input.nextLine();

                    Employee emp = new Employee(name, age, address, id, designation, salary);
                    service.addEmployee(emp);
                    break;

                case 2:
                    System.out.print("Enter Manager ID: ");
                    int mid = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Name: ");
                    String mname = input.nextLine();

                    System.out.print("Enter Address: ");
                    String maddress = input.nextLine();

                    System.out.print("Enter Age: ");
                    int mage = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Salary: ");
                    double msalary = input.nextDouble();
                    input.nextLine();

                    System.out.print("Enter Team Size: ");
                    int teamSize = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = input.nextLine();

                    Employee manager = new Manager(
                            mname, mage, maddress, mid,
                            "Manager", msalary, teamSize, dept
                    );

                    service.addEmployee(manager);
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    int uid = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Name (blank to skip): ");
                    String uname = input.nextLine();

                    System.out.print("Enter Address (blank to skip): ");
                    String uaddress = input.nextLine();

                    System.out.print("Enter Age (0 to skip): ");
                    int uage = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Salary (0 to skip): ");
                    double usalary = input.nextDouble();
                    input.nextLine();

                    System.out.print("Enter Designation (blank to skip): ");
                    String udesignation = input.nextLine();

                    System.out.print("Is this a Manager? (yes/no): ");
                    String isManager = input.nextLine();

                    if (isManager.equalsIgnoreCase("yes")) {
                        System.out.print("Enter Team Size (0 to skip): ");
                        int uts = input.nextInt();
                        input.nextLine();

                        System.out.print("Enter Department (blank to skip): ");
                        String udept = input.nextLine();

                        service.updateManager(uid, uname, uage, uaddress,
                                udesignation, usalary, uts, udept);
                    } else {
                        service.updateEmployee(uid, uname, uage, uaddress,
                                udesignation, usalary);
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID: ");
                    int sid = input.nextInt();
                    input.nextLine();
                    service.seeOneEmployee(sid);
                    break;

                case 5:
                    service.displayAll();
                    break;

                case 0:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        input.close();
    }
}
