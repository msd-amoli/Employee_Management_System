public class EmployeeService {

    private Employee[] employees;
    private int count;

    public EmployeeService(int size) {
        employees = new Employee[size];
        count = 0;
    }

    public void addEmployee(Employee employee) {

        if (findById(employee.getEmpId()) != null) {
            System.out.println("Employee with ID " + employee.getEmpId() + " already exists");
            return;
        }

        if (count < employees.length) {
            employees[count++] = employee;
            System.out.println("Employee added successfully");
        } else {
            System.out.println("Employee limit exceeded");
        }
    }

    public void updateEmployee(int id, String name, int age, String address,
                               String designation, double salary) {
 try {
     Employee employee = findById(id);

     if (employee == null) {
         System.out.println("Employee not found");
         return;
     }

     if (name != null && !name.isEmpty()) employee.setName(name);
     if (age > 0) employee.setAge(age);
     if (address != null && !address.isEmpty()) employee.setAddress(address);
     if (designation != null && !designation.isEmpty()) employee.setDesignation(designation);
     if (salary > 0) employee.setSalary(salary);

     System.out.println("Employee updated successfully");
 }catch (Exception e) {
     System.out.println(e.getMessage());
 }
    }

    public void updateManager(int id, String name, int age, String address,
                              String designation, double salary,
                              int teamSize, String department) {
        try {
            Employee employee = findById(id);

            if (employee == null) {
                System.out.println("Employee not found");
                return;
            }

            if (!(employee instanceof Manager)) {
                System.out.println("Employee is not a Manager");
                return;
            }

            Manager manager = (Manager) employee;

            if (name != null && !name.isEmpty()) manager.setName(name);
            if (age > 0) manager.setAge(age);
            if (address != null && !address.isEmpty()) manager.setAddress(address);
            if (designation != null && !designation.isEmpty()) manager.setDesignation(designation);
            if (salary > 0) manager.setSalary(salary);
            if (teamSize > 0) manager.setTeamSize(teamSize);
            if (department != null && !department.isEmpty()) manager.setDepartment(department);

            System.out.println("Manager updated successfully");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void displayAll() {
        if (count == 0) {
            System.out.println("No employees to display");
            return;
        }

        for (int i = 0; i < count; i++) {
            employees[i].displayInfo();
            System.out.println("---------------------------------");
        }
    }

    public void seeOneEmployee(int empId) {
        Employee employee = findById(empId);

        if (employee == null) {
            System.out.println("Employee not found");
            return;
        }

        employee.displayInfo();
    }


    private Employee findById(int empId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmpId() == empId) {
                return employees[i];
            }
        }
        return null;
    }
}
