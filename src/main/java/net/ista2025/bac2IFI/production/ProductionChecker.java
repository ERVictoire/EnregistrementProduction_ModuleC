package net.ista2025.bac2IFI.production;

//classe permettant de détecter des anomalies de production
public class ProductionChecker {

    // retourne true si le taux de défaut dépasse le seuil critique (5%)
    public boolean estAnomalie(double taux) {
        return taux > 5;
    }
}
