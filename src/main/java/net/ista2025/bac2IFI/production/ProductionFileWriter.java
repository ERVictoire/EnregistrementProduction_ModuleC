package net.ista2025.bac2IFI.production;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class ProductionFileWriter {

    public void ecrire(ProductionData data, int total, double taux) {
        try {
            File file = new File("data/production.csv");
            boolean nouveau = !file.exists();

            FileWriter writer = new FileWriter(file, true);

            if (nouveau) {
                writer.write("date, operateur, piece, qtyOK, qtyKO, total, tauxDefaut\n");
            }
            writer.write(
                    data.date + ", " +
                        data.operatorId + "," +
                        data.piece + ", " +
                        data.qtyOK + ", " +
                        data.qtyKO + ", " +
                        total + ", " +
                        taux + "\n"
            );

            writer.close();

            System.out.println("Enregistrement csv ok");

        } catch (IOException e) {
            System.out.println("Erreur écriture fichier" + e.getMessage());
        }
    }
}
