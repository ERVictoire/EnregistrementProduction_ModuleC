package net.ista2025.bac2IFI.production;

public class ProductionService {
    private ProductionValidator validator = new ProductionValidator();
    private ProductionCalculator calculator = new ProductionCalculator();
    private ProductionChecker checker = new ProductionChecker();

    public void traiter(ProductionData data) {

        if(!validator.valider(data)) {
            System.out.println("!!! Données invalides." + validator.getMessageErreur());
            return;
        }

        int total = calculator.calculTotal(data);
        double taux = calculator.calculTauxDefaut(data);
        boolean anomalie = checker.estAnomalie(taux);

        System.out.println("\n=== RESULTAT PRODUCTION ===");
        System.out.println("Total Produit : " + total);
        System.out.println("Taux défaut : " + String.format("%.2f", taux) + "%");

        if (anomalie) {
            System.out.println("ATTENTION : anomalie détectée");
        }

        new ProductionFileWriter().ecrire(data, total, taux);
    }
}
