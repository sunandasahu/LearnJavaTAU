public class ConstructorExa {

    String empName;
    int empId;
  // Parameterized constructor
    ConstructorExa(String empName, int empId){
        this.empName = empName;
        this.empId = empId;
    }

    public void getEmpInfo(){
        System.out.println(empId+" - EmployeeId And " + empName + ": Employee Name");
    }

    public static void main(String []args){
        ConstructorExa emp1 = new ConstructorExa( "Sunanda", 111);
        ConstructorExa emp2 = new ConstructorExa("Arushi", 222);
        emp1.getEmpInfo();
        emp2.getEmpInfo();
    }

}
