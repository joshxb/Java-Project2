package Version2;

public class Employee {

    private int empID;
    private String empName;

    public Employee() {
    }

    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public double computeSalary(){
        return 0;
    }

    //    Show the information
    public void displayInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee ID: ");
        sb.append(this.getEmpID());
        sb.append("\nEmployee Name: ");
        sb.append(this.getEmpName());
        return sb.toString();
    }

}
