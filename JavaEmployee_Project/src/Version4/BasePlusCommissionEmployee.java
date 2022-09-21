package Version4;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private float baseSalary;

    public BasePlusCommissionEmployee() {
    }

    public BasePlusCommissionEmployee(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(float baseSalary, float totalSales, int empID, String empName) {
        super(totalSales, empID, empName);
        this.baseSalary = baseSalary;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    //    Compute the salary
    @Override
    public double computeSalary() {
        return super.computeSalary() + baseSalary;
    }

}
