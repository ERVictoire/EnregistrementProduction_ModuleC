package net.ista2025.bac2IFI;

import net.ista2025.bac2IFI.production.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductionInput input = new ProductionInput();

        ProductionData data = input.saisirProduction();

        ProductionService service = new ProductionService();

        service.traiter(data);

        genererReport();
    }

    public static void genererReport () {
        String date = LocalDate.now().toString();
        String nomFichier = "data/report_" + date + ".txt";

        try {
            File dossier = new File("data");
            if (!dossier.exists()) {
                dossier.mkdir();
            }

            FileWriter writer = new FileWriter(nomFichier);

            writer.write("=== REPORT PRODUCTION ===\n");
            writer.write("Date : " + date + "\n");
            writer.write("Programme exécuté avec succès\n");
            writer.write("production.csv généré\n");

            writer.close();

            System.out.println("Report généré dans : " + nomFichier);

        } catch (IOException e) {
            System.out.println("Erreut génération report");
            e.printStackTrace();
        }
    }
}