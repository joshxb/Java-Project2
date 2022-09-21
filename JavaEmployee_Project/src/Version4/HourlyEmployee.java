package Version4;

public class HourlyEmployee extends Employee {

    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(float totalHoursWorked, double ratePerHour) {
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(float totalHoursWorked, double ratePerHour, int empID, String empName) {
        super(empID, empName);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
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
        sb.append(super.toString());
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
