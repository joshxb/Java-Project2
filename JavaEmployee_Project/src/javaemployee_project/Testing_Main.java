package javaemployee_project;

public class Testing_Main {

    public static void main(String[] args) {
        HourlyEmployee main = new HourlyEmployee(21103808, "Joshua Algadipe", 40, 100);
        System.out.println(main);
        System.out.println("Salary: " + main.computeSalary());
    }

}
