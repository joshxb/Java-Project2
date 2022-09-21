package Version3;

public class EmployeeRoster extends Employee {

    private String[] h_array = {};
    private String[] c_array = {};
    private String[] bc_array = {};
    private String[] p_array = {};

    public EmployeeRoster() {
    }

    public EmployeeRoster(int empID, String empName) {
        super(empID, empName);
    }

    public void countHourlyEmployee() {
        System.out.println(this.h_array.length);
    }

    public void countPieceWorkerEmployee() {
        System.out.println(this.p_array.length);
    }

    public void countCommissionEmployee() {
        System.out.println(this.c_array.length);
    }

    public void countBasePlusCommissionEmployee() {
        System.out.println(this.bc_array.length);
    }

    public void displayHourlyEmployee() {
        for (String i : h_array) {
            System.out.println(i);
        }
    }

    public void displayPieceWorkerEmployee() {
        for (String i : p_array) {
            System.out.println(i);
        }
    }

    public void displayCommissionEmployee() {
        for (String i : c_array) {
            System.out.println(i);
        }
    }

    public String addEmployee() {
        return "";
    }

    public int removeEmployee() {
        return 0;
    }

    public void displayEmployee() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hourly Employees: \n");
        for (String i : h_array) {
            sb.append(i).append("\n");
        }
        sb.append("Commission Employees: \n");
        for (String i : c_array) {
            sb.append(i).append("\n");
        }
        sb.append("BasePlusCommission Employees: \n");
        for (String i : bc_array) {
            sb.append(i).append("\n");
        }
        sb.append("PieceWorker Employees: \n");
        for (String i : p_array) {
            sb.append(i).append("\n");
        }
        System.out.println(sb.toString());
    }

}
