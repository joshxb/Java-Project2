package Version3;

import java.util.Formatter;

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
        System.out.println("Total Hourly Employee/s: " + (this.h_array.length - 1) + " employee/s\n");

    }

    public void countPieceWorkerEmployee() {
        System.out.println("Total PieceWorker Employee/s: " + (this.p_array.length - 1) + " employee/s\n");
    }

    public void countCommissionEmployee() {
        System.out.println("Total Commission Employee/s: " + (this.c_array.length - 1) + " employee/s\n");
    }

    public void countBasePlusCommissionEmployee() {
        System.out.println("Total BasePlusCommission Employee/s: " + (this.bc_array.length - 1) + " employee/s\n");
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
        String findtype = null;
        String[] another_arrh = new String[h_array.length - 1];
        String[] another_arrc = new String[c_array.length - 1];
        String[] another_arrbc = new String[bc_array.length - 1];
        String[] another_arrp = new String[p_array.length - 1];
        int posh = 0;
        int posc = 0;
        int posbc = 0;
        int posp = 0;
        for (int i : h_arrayID) {
            if (i == empID) {
                findtype = "h";
                break;
            }
            posh++;
        }
        for (int i : c_arrayID) {
            if (i == empID) {
                findtype = "c";
                break;
            }
            posc++;
        }
        for (int i : bc_arrayID) {
            if (i == empID) {
                findtype = "bc";
                break;
            }
            posbc++;
        }
        for (int i : p_arrayID) {
            if (i == empID) {
                findtype = "p";
                break;
            }
            posp++;
        }
        if (null != findtype) {
            switch (findtype) {
                case "h" -> {
                    for (int i = 0, k = 0; i < h_array.length; i++) {
                        if (i == posh) {
                            continue;
                        }
                        another_arrh[k++] = h_array[i];
                    }
                    h_array = new String[another_arrh.length];
                    System.arraycopy(another_arrh, 0, h_array, 0, h_array.length);
                }
                case "c" -> {
                    for (int i = 0, k = 0; i < c_array.length; i++) {
                        if (i == posc) {
                            continue;
                        }
                        another_arrc[k++] = c_array[i];
                    }
                    c_array = new String[another_arrc.length];
                    System.arraycopy(another_arrc, 0, c_array, 0, c_array.length);
                }
                case "bc" -> {
                    for (int i = 0, k = 0; i < bc_array.length; i++) {
                        if (i == posbc) {
                            continue;
                        }
                        another_arrbc[k++] = bc_array[i];
                    }
                    bc_array = new String[another_arrbc.length];
                    System.arraycopy(another_arrbc, 0, bc_array, 0, bc_array.length);
                }
                case "p" -> {
                    for (int i = 0, k = 0; i < p_array.length; i++) {
                        if (i == posp) {
                            continue;
                        }
                        another_arrp[k++] = p_array[i];
                    }
                    p_array = new String[another_arrp.length];
                    System.arraycopy(another_arrp, 0, p_array, 0, p_array.length);
                }
                default -> {
                }

            }
        }

    }

    public void displayEmployee() {

        Formatter fmt = new Formatter();
        fmt.format("%s", """
                                                                                       All Employees
                         ---------------------------------------------------------------------------------------------------------------------------------------------------
                         """);
        fmt.format("%36s %40s %40s\n", "Employee's ID", "Name of Employee ", "Employee's Type");

        if (h_array.length == 0) {
        } else {
            for (int i = 0; i < h_array.length; i++) {

                if (h_array[i] != null) {
                    fmt.format("%33s %40s %43s\n", h_arrayID[i], h_array[i], h_arrayType[i]);

                }
            }

        }

        if (c_array.length == 0) {
        } else {
            for (int i = 0; i < c_array.length; i++) {

                if (c_array[i] != null) {

                    fmt.format("%33s %41s %43s\n", c_arrayID[i], c_array[i], c_arrayType[i]);
                }
            }

        }

        if (bc_array.length == 0) {
        } else {
            for (int i = 0; i < bc_array.length; i++) {
                if (bc_array[i] != null) {
                    fmt.format("%33s %40s %49s\n", bc_arrayID[i], bc_array[i], bc_arrayType[i]);
                }
            }
        }

        if (p_array.length == 0) {
        } else {
            for (int i = 0; i < p_array.length; i++) {
                if (p_array[i] != null) {
                    fmt.format("%33s %42s %43s\n", p_arrayID[i], p_array[i], p_arrayType[i]);
                }

            }
        }
        fmt.format("%s", """
                         ---------------------------------------------------------------------------------------------------------------------------------------------------
                         """);
        System.out.println(fmt);
    }

}
