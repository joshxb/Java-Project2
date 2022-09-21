package Version1;

public class CommissionEmployee {

    private int empID;
    private String empName;
    private float totalSales;

    public CommissionEmployee() {
        this(0, null);
    }

    public CommissionEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }

    public CommissionEmployee(int empID, String empName, float totalSales) {
        this.empID = empID;
        this.empName = empName;
        this.totalSales = totalSales;
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

    public float getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(float totalSales) {
        this.totalSales = totalSales;
    }

    //    Show the information
    public void displayInfo() {
        System.out.println(this);
    }

    //    Compute the salary
    public double computeSalary() {
        float rate;
        if (totalSales >= 0 && totalSales < 10_000) {
            rate = 0.05f;
        } else if (totalSales >= 10_000 && totalSales < 50_000) {
            rate = 0.1f;
        } else if (totalSales >= 50_000 && totalSales < 100_000) {
            rate = 0.15f;
        } else if (totalSales >= 100_000) {
            rate = 0.3f;
        } else {
            rate = 0;
        }

        return rate * totalSales;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee ID: ");
        sb.append(this.getEmpID());
        sb.append("\nEmployee Name: ");
        sb.append(this.getEmpName());
        sb.append("\nTotal Sales: ");
        sb.append(String.format("Php %,.2f", this.getTotalSales()));
        sb.append("\nSalary: ");
        sb.append(String.format("Php %,.2f", this.computeSalary()));
        sb.append("\n");
        return sb.toString();
    }

}
