package Version1;

public class TestingMain {

    public static void main(String[] args) {
        HourlyEmployee[] hourly_e = new HourlyEmployee[5];
        CommissionEmployee[] commission_e = new CommissionEmployee[5];
        BasePlusCommissionEmployee[] basepluscommission_e = new BasePlusCommissionEmployee[5];
        PieceWorkerEmployee[] pieceworkeremployee_e = new PieceWorkerEmployee[5];
//        Hourly Employees instantiation
        hourly_e[0] = new HourlyEmployee();
        hourly_e[1] = new HourlyEmployee(21103808, "Joshua Algadipe");
        hourly_e[2] = new HourlyEmployee(21103808, "Joshua Algadipe", 40, 100);
        hourly_e[3] = new HourlyEmployee(21103809, "Michael Lucth", 50, 100);
        hourly_e[4] = new HourlyEmployee(22102809, "Miguil Lopez", 40, 120);
        //        Commission Employees instantiation     
        commission_e[0] = new CommissionEmployee();
        commission_e[1] = new CommissionEmployee(21103801, "Michael Adams");
        commission_e[2] = new CommissionEmployee(21123806, "Mary Grace", 320);
        commission_e[3] = new CommissionEmployee(31103809, "Lyca Avenido", 129);
        commission_e[4] = new CommissionEmployee(12102809, "Via Enopia", 234);
        //        BasePlusCommission Employees instantiation     
        basepluscommission_e[0] = new BasePlusCommissionEmployee();
        basepluscommission_e[1] = new BasePlusCommissionEmployee(22103801, "Xyriel Munoz");
        basepluscommission_e[2] = new BasePlusCommissionEmployee(11123806, "Stephen Curry", 124, 1_200);
        basepluscommission_e[3] = new BasePlusCommissionEmployee(36403309, "Sandy Temperatura", 160, 4_500);
        basepluscommission_e[4] = new BasePlusCommissionEmployee(12812809, "Lyca Mendrez", 234, 2_600);
        //        PieceWorker Employee instantiation     
        pieceworkeremployee_e[0] = new PieceWorkerEmployee();
        pieceworkeremployee_e[1] = new PieceWorkerEmployee(22103801, "Larry Lang");
        pieceworkeremployee_e[2] = new PieceWorkerEmployee(41133806, "Stephany", 234, 50);
        pieceworkeremployee_e[3] = new PieceWorkerEmployee(36403309, "Sandy Lacy", 121, 23);
        pieceworkeremployee_e[4] = new PieceWorkerEmployee(12812809, "Kyle Mendez", 123, 50);

        System.out.println("Hourly Employees: \n");
        for (HourlyEmployee i : hourly_e) {
            System.out.println(i);
        }
        System.out.println("Commssion Employees: \n");
        for (CommissionEmployee i : commission_e) {
            System.out.println(i);
        }
        System.out.println("BasePlusCommssion Employees: \n");
        for (BasePlusCommissionEmployee i : basepluscommission_e) {
            System.out.println(i);
        }
        System.out.println("PieceWorker Employees: \n");
        for (PieceWorkerEmployee i : pieceworkeremployee_e) {
            System.out.println(i);
        }
    }

}
