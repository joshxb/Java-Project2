package Version3;

public class EmployeeRoster extends Employee {
    private String[] array = {};

    public EmployeeRoster() {
    }

 
    public EmployeeRoster(int empID, String empName) {
        super(empID, empName);
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void countHourlyEmployee() {

    }

    public void countPieceWorkerEmployee() {

    }

    public int countCommissionEmployee() {
        return 0;
    }

    public int countBasePlusCommissionEmployee() {
        return 0;
    }

    public void displayHourlyEmployee() {

    }

    public void displayPieceWorkerEmployee() {

    }

    public void displayCommissionEmployee() {

    }

    public String addEmployee() {
        return "";
    }

    public int removeEmployee() {
        return 0;
    }

    public void displayEmployee() {

    }

}
