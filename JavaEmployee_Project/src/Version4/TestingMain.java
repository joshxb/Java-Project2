package Version4;

public class TestingMain {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new HourlyEmployee(40, 100, 21103808, "Joshua Algadipe");
        employees[1] = new CommissionEmployee(40_200, 103, "Joseph Tan");
        employees[2] = new BasePlusCommissionEmployee(23_600, 10_200, 123, "Jonathan Reyes");
        employees[3] = new HourlyEmployee(40, 100, 22102809, "Miguil Lopez");
        employees[4] = new CommissionEmployee(56_200, 113, "Cassandra Alcantara");
        for (Employee i : employees) {
            System.out.println(i);

        }
        System.out.println("\nSalaries:");
        for (Employee i : employees) {
            System.out.println(String.format("%s - Php %.2f",
                    i.getEmpName(), i.computeSalary()));

        }

    }
}
