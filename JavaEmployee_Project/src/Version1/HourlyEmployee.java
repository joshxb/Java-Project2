package Version1;

public class HourlyEmployee {
    
    private int empID;
    private String empName;
    private float totalHoursWorked;
    private double ratePerHour;

    //    default constructor
    public HourlyEmployee() {
        this(0, null);
    }

    //    first constructor with parameter
    public HourlyEmployee(int empID, String empName) {
        this(empID, empName, 0, 0);
    }

    //    seoond constructor with parameter
    public HourlyEmployee(int empID, String empName, float totalHoursWorked, double ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    //    set Employee ID
    public void setEmpID(int empID) {
        this.empID = empID;
    }

    //    get Employee ID
    public int getEmpID() {
        return this.empID;
    }

    //    set Employee Name
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    //    get Employee Name
    public String getEmpName() {
        return this.empName;
    }

    //    set total hours worked
    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    //    get total hours worked
    public float getTotalHoursWorked() {
        return this.totalHoursWorked;
    }

    //    set rate per hour
    public void setRatePerHour(int ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    //    get rate per hour
    public double getRatePerHour() {
        return this.ratePerHour;
    }

    //    Show the information
    public void displayInfo() {
        System.out.println(this);
    }

    //    Compute the salary
    public double computeSalary() {
        float totalHours = this.totalHoursWorked;
        float overtimeHours = 0;
        
        if (totalHours > 40) {
            overtimeHours = totalHours - 40;
            totalHours = 40;
        }
        return totalHours * ratePerHour + overtimeHours * ratePerHour * 1.5;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee ID: ");
        sb.append(this.getEmpID());
        sb.append("\nEmployee Name: ");
        sb.append(this.getEmpName());
        sb.append("\nTotal Hours Worked: ");
        sb.append(this.getTotalHoursWorked());
        sb.append("hour(s)");
        sb.append("\nRate per hour: ");
        sb.append(String.format("Php %,.2f", this.getRatePerHour()));
        sb.append("\nSalary: ");
        sb.append(String.format("Php %,.2f", this.computeSalary()));
        sb.append("\n");
        return sb.toString();
    }
    
}
