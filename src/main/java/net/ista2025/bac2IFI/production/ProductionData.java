package net.ista2025.bac2IFI.production;

public class ProductionData {

    public String date;
    public String operatorId;
    public String piece;
    public int qtyOK;
    public int qtyKO;

    public ProductionData(String date, String operatorId, String piece, int qtyOK, int qtyKO){
        this.date = date;
        this.operatorId = operatorId;
        this.piece = piece;
        this.qtyOK = qtyOK;
        this.qtyKO = qtyKO;
    }
}
