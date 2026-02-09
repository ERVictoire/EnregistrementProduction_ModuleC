package net.ista2025.bac2IFI;

import net.ista2025.bac2IFI.production.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductionInput input = new ProductionInput();

        ProductionData data = input.saisirProduction();

        ProductionService service = new ProductionService();

        service.traiter(data);
    }
}