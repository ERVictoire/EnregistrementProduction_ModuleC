package net.ista2025.bac2IFI.production;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

//classe responsable de l'écriture des données de production dans le fichier csv
public class ProductionFileWriter {

    //ouvre ou crée le fichier production.csv
    //Ajoute une nouvelle ligne de production
    //Gère les erreurs d'écriture ( fichier ouvert ailleurs)
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
