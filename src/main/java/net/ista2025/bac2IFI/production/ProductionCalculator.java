package net.ista2025.bac2IFI.production;

// Classe responsable des calcul liés a la production
// Calcul le nombre total des pièces produites
public class ProductionCalculator {

    // Calcul les total et le taux des défaut
    public int calculTotal(ProductionData data) {
        return data.qtyOK + data.qtyKO;
    }

    // calcul le pourcentage de défaut
    // (qtyKO / total)*100
    public double calculTauxDefaut(ProductionData data) {

        int total = calculTotal(data);

        if (total == 0) return 0;

        return (double) data.qtyKO / total * 100;
    }

}
