package net.ista2025.bac2IFI.production;

public class ProductionCalculator {

    public int calculTotal(ProductionData data) {
        return data.qtyOK + data.qtyKO;
    }

    public double calculTauxDefaut(ProductionData data) {

        int total = calculTotal(data);

        if (total == 0) return 0;

        return (double) data.qtyKO / total * 100;
    }

}
