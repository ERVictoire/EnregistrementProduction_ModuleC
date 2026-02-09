package net.ista2025.bac2IFI.production;


import java.util.Scanner;

public class ProductionInput {

    public  ProductionData saisirProduction () {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Date (AAAA-MM-JJ) : ");
        String date = scanner.nextLine();

        System.out.println("Operator ID : ");
        String operatorId = scanner.nextLine();

        System.out.println("Piece :");
        String piece = scanner.nextLine();

        System.out.println("Quantité ok : ");
        int qtyOK = Integer.parseInt(scanner.nextLine());

        System.out.println("Quantinté KO ");
        int qtyKO = Integer.parseInt(scanner.nextLine());

        return new ProductionData(date, operatorId, piece, qtyOK, qtyKO);
    }
}
