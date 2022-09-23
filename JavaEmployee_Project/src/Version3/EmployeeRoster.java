package Version3;

import java.util.Arrays;

public class EmployeeRoster extends Employee {

    private String[] h_array = {null};
    private String[] c_array = {null};
    private String[] bc_array = {null};
    private String[] p_array = {null};

    private int[] h_arrayID = {0};
    private int[] c_arrayID = {0};
    private int[] bc_arrayID = {0};
    private int[] p_arrayID = {0};

    private String[] h_arrayType = {null};
    private String[] c_arrayType = {null};
    private String[] bc_arrayType = {null};
    private String[] p_arrayType = {null};

    public EmployeeRoster() {
    }

    public EmployeeRoster(int empID, String empName) {
        super(empID, empName);
    }

    public void countHourlyEmployee() {
        System.out.println("Total Hourly Employee/s: " + this.h_array.length + " employee/s");
    }

    public void countPieceWorkerEmployee() {
        System.out.println("Total PieceWorker Employee/s: " + this.p_array.length + " employee/s");
    }

    public void countCommissionEmployee() {
        System.out.println("Total Commission Employee/s: " + this.c_array.length + " employee/s");
    }

    public void countBasePlusCommissionEmployee() {
        System.out.println("Total BasePlusCommission Employee/s: " + this.bc_array.length + " employee/s");
    }

    public void displayHourlyEmployee() {
        System.out.println("Hourly Employee/s: \n");
        for (String i : h_array) {
            if (i != null) {
                System.out.println(i);
            }

        }
    }

    public void displayPieceWorkerEmployee() {
        System.out.println("PieceWorker Employee/s: \n");
        for (String i : p_array) {
            if (i != null) {
                System.out.println(i);
            }
        }
    }

    public void displayCommissionEmployee() {
        System.out.println("Commission Employee/s: \n");
        for (String i : c_array) {
            if (i != null) {
                System.out.println(i);
            }

        }
    }

    public void displayBasePlusCommissionEmployee() {
        System.out.println("BasePlusCommission Employee/s: \n");
        for (String i : bc_array) {
            if (i != null) {
                System.out.println(i);
            }
        }
    }

    public void addEmployee(int empID, String empName, String empType) {
        super.empID = empID;
        super.empName = empName;
        if (empType.toLowerCase().contains("hourly")) {
            String[] store = new String[h_array.length];
            int[] storeID = new int[h_arrayID.length];
            String[] storeTYPE = new String[h_arrayType.length];
            for (int i = 0; i < store.length; i++) {
                store[i] = h_array[i];
                storeID[i] = h_arrayID[i];
                storeTYPE[i] = h_arrayType[i];
            }
            h_array = new String[h_array.length + 1];
            h_arrayID = new int[h_arrayID.length + 1];
            h_arrayType = new String[h_arrayType.length + 1];

            for (int i = 0; i < h_array.length; i++) {
                if (i == h_array.length - 1) {
                    h_array[i] = empName;
                    h_arrayID[i] = empID;
                    h_arrayType[i] = "Hourly Employee";
                } else {
                    h_array[i] = store[i];
                    h_arrayID[i] = storeID[i];
                    h_arrayType[i] = storeTYPE[i];
                }
            }
        } else if (empType.toLowerCase().contains("plus commission")) {
            String[] store = new String[bc_array.length];
            int[] storeID = new int[bc_arrayID.length];
            String[] storeTYPE = new String[bc_arrayType.length];
            for (int i = 0; i < store.length; i++) {
                store[i] = bc_array[i];
                storeID[i] = bc_arrayID[i];
                storeTYPE[i] = bc_arrayType[i];
            }
            bc_array = new String[bc_array.length + 1];
            bc_arrayID = new int[bc_arrayID.length + 1];
            bc_arrayType = new String[bc_arrayType.length + 1];

            for (int i = 0; i < bc_array.length; i++) {
                if (i == bc_array.length - 1) {
                    bc_array[i] = empName;
                    bc_arrayID[i] = empID;
                    bc_arrayType[i] = "BasePlusCommission Employee";
                } else {
                    bc_array[i] = store[i];
                    bc_arrayID[i] = storeID[i];
                    bc_arrayType[i] = storeTYPE[i];
                }
            }
        } else if (empType.toLowerCase().contains("commission")) {
            String[] store = new String[c_array.length];
            int[] storeID = new int[c_arrayID.length];
            String[] storeTYPE = new String[c_arrayType.length];
            for (int i = 0; i < store.length; i++) {
                store[i] = c_array[i];
                storeID[i] = c_arrayID[i];
                storeTYPE[i] = c_arrayType[i];
            }
            c_array = new String[c_array.length + 1];
            c_arrayID = new int[c_arrayID.length + 1];
            c_arrayType = new String[c_arrayType.length + 1];

            for (int i = 0; i < c_array.length; i++) {
                if (i == c_array.length - 1) {
                    c_array[i] = empName;
                    c_arrayID[i] = empID;
                    c_arrayType[i] = "Commission Employee";
                } else {
                    c_array[i] = store[i];
                    c_arrayID[i] = storeID[i];
                    c_arrayType[i] = storeTYPE[i];
                }
            }
        } else if (empType.toLowerCase().contains("piece")) {
            String[] store = new String[p_array.length];
            int[] storeID = new int[p_arrayID.length];
            String[] storeTYPE = new String[p_arrayType.length];
            for (int i = 0; i < store.length; i++) {
                store[i] = p_array[i];
                storeID[i] = p_arrayID[i];
                storeTYPE[i] = p_arrayType[i];
            }
            p_array = new String[p_array.length + 1];
            p_arrayID = new int[p_arrayID.length + 1];
            p_arrayType = new String[p_arrayType.length + 1];

            for (int i = 0; i < p_array.length; i++) {
                if (i == p_array.length - 1) {
                    p_array[i] = empName;
                    p_arrayID[i] = empID;
                    p_arrayType[i] = "PieceWorker Employee";
                } else {
                    p_array[i] = store[i];
                    p_arrayID[i] = storeID[i];
                    p_arrayType[i] = storeTYPE[i];
                }
            }
        }

    }

    public void removeEmployee(int empID) {
        int posh = 0;
        int posc = 0;
        int posbc = 0;
        int posp = 0;

        for (int id : h_arrayID) {
            if (empID == id) {
                int removeIndex = posh ;
                for (int i = removeIndex; i < h_array.length - 1; i++) {
                    h_array[i] = h_array[i + 1];
                    h_arrayID[i] = h_arrayID[i + 1];
                    h_arrayType[i] = h_arrayType[i + 1];
                }
                break;
            }
            posh++;
           
        }
         System.out.println(posh);
        for (int id : c_arrayID) {
            if (empID == id) {
                int removeIndex = posc;
                for (int i = removeIndex; i < c_arrayID.length - 1; i++) {
                    c_array[i] = c_array[i + 1];
                    c_arrayID[i] = c_arrayID[i + 1];
                    c_arrayType[i] = c_arrayType[i + 1];
                }
            }
            posc++;
        }
        for (int id : bc_arrayID) {
            if (empID == id) {
                int removeIndex = posbc;
                for (int i = removeIndex; i < bc_arrayID.length - 1; i++) {
                    bc_array[i] = bc_array[i + 1];
                    bc_arrayID[i] = bc_arrayID[i + 1];
                    bc_arrayType[i] = bc_arrayType[i + 1];
                }
            }
            posbc++;
        }
        for (int id : p_arrayID) {
            if (empID == id) {
                int removeIndex = posp;
                for (int i = removeIndex; i < p_arrayID.length - 1; i++) {
                    p_array[i] = p_array[i + 1];
                    p_arrayID[i] = p_arrayID[i + 1];
                    p_arrayType[i] = p_arrayType[i + 1];
                }
            }
            posp++;
        }

    }

    public void displayEmployee() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hourly Employees: \n");
        if (h_array.length == 0) {
            sb.append("No employees").append("\n");
        } else {
            for (int i = 0; i < h_array.length; i++) {

                if (h_array[i] != null) {

                    sb.append(h_array[i]).append(" - ").append(h_arrayID[i]).append("\n");
                }
            }

        }

        sb.append("\nCommission Employees: \n");
        if (c_array.length == 0) {
            sb.append("No employees").append("\n");
        } else {
            for (int i = 0; i < c_array.length; i++) {
                if (c_array[i] != null) {
                    sb.append(c_array[i]).append(" - ").append(c_arrayID[i]).append("\n");
                }
            }
        }
        sb.append("\nBasePlusCommission Employees: \n");
        if (bc_array.length == 0) {
            sb.append("No employees").append("\n");
        } else {
            for (int i = 0; i < bc_array.length; i++) {
                if (bc_array[i] != null) {
                    sb.append(bc_array[i]).append(" - ").append(bc_arrayID[i]).append("\n");
                }
            }
        }
        sb.append("\nPieceWorker Employees: \n");
        if (p_array.length == 0) {
            sb.append("No employees").append("\n");
        } else {
            for (int i = 0; i < p_array.length; i++) {
                if (p_array[i] != null) {
                    sb.append(p_array[i]).append(" - ").append(p_arrayID[i]).append("\n");
                }

            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        EmployeeRoster main = new EmployeeRoster();
        main.addEmployee(21103808, "Joshua Algadipe", "Hourly Employee");
        main.addEmployee(81103809, "Myla Sabanal", "hOURLY Employee");
        main.addEmployee(61103805, "Hadria Evarola", "Commission Employee");
        main.addEmployee(81303819, "Michael Aguinaldo", "Piece Worker Employee");
        main.addEmployee(81303859, "Lara Fuentes", "Base Plus Commission Employee");

        main.removeEmployee(21103808);
//        System.out.println(Arrays.toString(main.h_array));
//        System.out.println(main.c_array.length);
        main.displayEmployee();
    }
}
