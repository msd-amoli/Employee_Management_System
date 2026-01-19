public class Employee extends Person{

    private int empId;
    private String designation;
    private double salary;
    public Employee(String name, int age, String address ,int empId, String designation, double salary) {
        super(name, age, address);
        this.empId = empId;
        this.designation = designation;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("ID: "+empId);
        System.out.println("Designation: "+designation);
        System.out.println("Salary: "+salary);
    }


}
