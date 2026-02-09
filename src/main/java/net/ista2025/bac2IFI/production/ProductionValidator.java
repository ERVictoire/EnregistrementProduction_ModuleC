package net.ista2025.bac2IFI.production;

import java.nio.file.Files;
import java.io.*;
import java.nio.file.*;


public class ProductionValidator {

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
        if (data.qtyOK < 0) {
            messageErreur = "Quantinté OK négative";
            return false;
        }

        if (data.qtyKO < 0) {
            messageErreur = "Quantité KO négative";
            return false;
        }

        if (data.qtyOK == 0 && data.qtyKO == 0) {
            messageErreur = "Aucune production saisie";
            return false;
        }

        if (data.date == null || data.date.isEmpty()) {
            messageErreur = "Date manquante";
            return false;
        }

        if (data.operatorId == null || data.operatorId.isEmpty()) {
            messageErreur = "Operator ID manquant";
            return false;
        }

        if (!operatorExiste(data.operatorId)) {
            messageErreur = "Operator ID inconnu";
            return false;
        }

        if (data.piece == null || data.piece.isEmpty()) {
            messageErreur = "Pièce manquante";
            return false;
        }

        return true;
    }
}
