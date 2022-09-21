package Version4;

public class CommissionEmployee extends Employee {

    private float totalSales;

    public CommissionEmployee() {
    }

    public CommissionEmployee(float totalSales) {
        this.totalSales = totalSales;
    }

    public CommissionEmployee(float totalSales, int empID, String empName) {
        super(empID, empName);
        this.totalSales = totalSales;
    }

    public float getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(float totalSales) {
        this.totalSales = totalSales;
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
        sb.append(super.toString());
        sb.append("\nTotal Sales: ");
        sb.append(String.format("Php %,.2f", this.getTotalSales()));
        sb.append("\nSalary: ");
        sb.append(String.format("Php %,.2f", this.computeSalary()));
        sb.append("\n");
        return sb.toString();
    }

}
