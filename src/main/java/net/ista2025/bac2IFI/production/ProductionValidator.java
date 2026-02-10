package net.ista2025.bac2IFI.production;

import java.nio.file.Files;
import java.io.*;
import java.nio.file.*;

// Classe chargée de verifier la validité des données de production
// Applique les règles métier avant les traitement

public class ProductionValidator {

    // stockage les messages d'erreurs a la validation échouée
    private String messageErreur = "";

    public String getMessageErreur() {
        return messageErreur;
    }

    public boolean operatorExiste(String operatorId) {

        try {
            Path path = Paths.get("data/operators.txt");

            if (!Files.exists(path)) return false;

            for (String line : Files.readAllLines(path)) {
                if (line.trim().equals(operatorId)) {
                    return true;
                }
            }
        } catch (IOException e) {
            return false;
        }

        return false;
    }

    public boolean valider(ProductionData data) {

        // Vérifie que les quantités ne sont pas  négatives
        if (data.qtyOK < 0) {
            messageErreur = "Quantinté OK négative";
            return false;
        }

        if (data.qtyKO < 0) {
            messageErreur = "Quantité KO négative";
            return false;
        }

        // vérifie qu'au moins une pièce est produite
        if (data.qtyOK == 0 && data.qtyKO == 0) {
            messageErreur = "Aucune production saisie";
            return false;
        }

        // Verifie qua la date n'est pas vide
        if (data.date == null || data.date.isEmpty()) {
            messageErreur = "Date manquante";
            return false;
        }

        // Vérifie que l'opérateur existe dans operators.txt
        if (data.operatorId == null || data.operatorId.isEmpty()) {
            messageErreur = "Operator ID manquant";
            return false;
        }

        // Vérifie que l'opérateur saisie existe dans le  fichier operators.txt
        if (!operatorExiste(data.operatorId)) {
            messageErreur = "Operator ID inconnu";
            return false;
        }

        // Vérifie que la pièce n'est pas vide
        if (data.piece == null || data.piece.isEmpty()) {
            messageErreur = "Pièce manquante";
            return false;
        }

        return true;
    }
}
