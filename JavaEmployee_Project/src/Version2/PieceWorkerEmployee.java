package Version2;

public class PieceWorkerEmployee extends Employee {
    private float totalPiecesFinished;
    private double ratePerPiece;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(float totalPiecesFinished, double ratePerPiece) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(float totalPiecesFinished, double ratePerPiece, int empID, String empName) {
        super(empID, empName);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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

    //    Compute the salary
    @Override
    public double computeSalary() {
        float totalPieces = this.totalPiecesFinished;
        if (totalPieces >= 100) {
            return totalPieces * ratePerPiece * 10;
        }
        return totalPieces * ratePerPiece;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()); 
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
