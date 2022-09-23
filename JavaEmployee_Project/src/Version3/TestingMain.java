package Version3;

public class TestingMain {

    public static void main(String[] args) {
        EmployeeRoster main = new EmployeeRoster();
        main.addEmployee(21103808, "Joshua Algadipe", "Hourly Employee");
        main.addEmployee(81103809, "Myla Sabanal", "hOURLY Employee");
        main.addEmployee(61103805, "Hadrian Evarola", "Commission Employee");
        main.addEmployee(81303819, "Michael Aguinaldo", "Piece Worker Employee");
        main.addEmployee(81303859, "Lara Fuentes", "Base Plus Commission Employee");
        main.addEmployee(11103808, "Jason Laya", "Hourly Employee");
        main.addEmployee(41103829, "Carla Sanchez", "Piece Worker Employee");
        main.addEmployee(23412345, "Lord Gocotano", "Commission Employee");
        main.addEmployee(82301819, "Agustin Repollo", "Piece Worker Employee");
        main.addEmployee(81301859, "Lawrence Avenido", "Base Plus Commission Employee");

        main.removeEmployee(81301859);
        main.removeEmployee(21103808);

        main.displayHourlyEmployee();
        main.countHourlyEmployee();

        main.displayCommissionEmployee();
        main.countCommissionEmployee();

        main.displayBasePlusCommissionEmployee();
        main.countBasePlusCommissionEmployee();

        main.displayPieceWorkerEmployee();
        main.countPieceWorkerEmployee();

        main.displayEmployee();

    }
}
