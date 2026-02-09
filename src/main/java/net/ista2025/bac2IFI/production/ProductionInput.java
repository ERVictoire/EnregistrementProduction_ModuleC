package net.ista2025.bac2IFI.production;

import java.util.Scanner;

// Classe responsable de la saisie des données utilisateur depuis la console.
public class ProductionInput {

    public  ProductionData saisirProduction () {

        // Scanner utilisé pour lire les entrées clavier
        Scanner scanner = new Scanner(System.in);

        // Demande et récupère la date de production
        System.out.println("Date (AAAA-MM-JJ) : ");
        String date = scanner.nextLine();

        // Demande et récupère l'identifiant de l'opérateur
        System.out.println("Operator ID : ");
        String operatorId = scanner.nextLine();

        // Demande et récupère la pièce produite
        System.out.println("Piece :");
        String piece = scanner.nextLine();

        // Demande et récupère la quantité OK
        System.out.println("Quantité ok : ");
        int qtyOK = Integer.parseInt(scanner.nextLine());

        // Demande et récupère la quantité KO
        System.out.println("Quantinté KO ");
        int qtyKO = Integer.parseInt(scanner.nextLine());

        return new ProductionData(date, operatorId, piece, qtyOK, qtyKO);
    }
}
