package edu.monmouth.employee;

public class PieceEmployee implements Employee {

    private int ratePerPiece;
    private int piecesMade;

    public PieceEmployee(int ratePerPiece) {
        this.ratePerPiece = ratePerPiece;


    }

    @Override
    public int getMonthlyPay() {
        return ratePerPiece * piecesMade;
    }

    public void setPiecesMade(int piecesMade) {
        this.piecesMade = piecesMade;
    }

    @Override
    public String toString() {
        return "PieceEmployee{" +
                "ratePerPiece=" + ratePerPiece +
                ", piecesMade=" + piecesMade +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        PieceEmployee other = (PieceEmployee) obj;
        return ratePerPiece == other.ratePerPiece && piecesMade == other.piecesMade;
    }

}
