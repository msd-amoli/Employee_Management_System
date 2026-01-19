public class EmployeeService {
    private Employee [] employees;
    private  int count;
    public EmployeeService(int size) {
        employees = new Employee[size];
        count = 0;
    }
    public void addEmployee(Employee employee) {
        if(count<employees.length) {
            employees[count] = employee;
            count++;
        }else{
            System.out.println("Exceeding size..");
        }
    }

    public void updateEmployee(int id, String name, int age, String address,
                               String designation, double salary){
     Employee employee = findById(id);

     if(employee != null){

         if(name!=null && !name.isEmpty()){
             employee.setName(name);
         }
         if(age>0){
             employee.setAge(age);
         }
         if(address!=null && !address.isEmpty()){
             employee.setAddress(address);
         }
         if(designation!=null && !designation.isEmpty()){
             employee.setDesignation(designation);
         }
         if(salary>0){
             employee.setSalary(salary);
         }


     }


    }

    private Employee findById(int empId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmpId() == empId) {
                return employees[i];
            }
        }
        return null;
    }

    public void displayAll(){
        for (int i = 0; i < count; i++) {
            employees[i].displayInfo();
            System.out.println("___________________________________");
        }
    }


}
