package Version1;

public class PieceWorkerEmployee {

    private int empID;
    private String empName;
    private float totalPiecesFinished;
    private double ratePerPiece;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }

    public PieceWorkerEmployee(int empID, String empName, float totalPiecesFinished, double ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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

    public float getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(float totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    //    Show the information
    public void displayInfo() {
        System.out.println(this);
    }

    //    Compute the salary
    public double computeSalary() {
        float total = 0;
        float totalPieces = this.totalPiecesFinished;
        if (totalPieces >= 100) {
            total = (float) (totalPieces * ratePerPiece * 10);
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee ID: ");
        sb.append(this.getEmpID());
        sb.append("\nEmployee Name: ");
        sb.append(this.getEmpName());
        sb.append("\nTotal Pieces Finished: ");
        sb.append(this.getTotalPiecesFinished());
        sb.append("hour(s)");
        sb.append("\nRate per piece: ");
        sb.append(String.format("Php %,.2f", this.getRatePerPiece()));
        sb.append("\nSalary: ");
        sb.append(String.format("Php %,.2f", this.computeSalary()));
        sb.append("\n");
        return sb.toString();
    }

}
