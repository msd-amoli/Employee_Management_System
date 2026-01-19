public class Manager extends Employee{
    private int teamSize;
    private String department;

    public Manager(String name, int age, String address,int empId,String designation,double salary,int teamSize, String department) {
        super(name,age,address,empId,designation,salary);
        this.teamSize = teamSize;
        this.department = department;
    }
    public int getTeamSize() {
        return teamSize;
    }
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Team Size: "+teamSize);
        System.out.println("Department: "+department);
    }
}
