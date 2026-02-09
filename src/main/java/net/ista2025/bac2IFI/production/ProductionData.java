package net.ista2025.bac2IFI.production;

// classe modèle représentant une saisie de production.
// contient les données brutes saisie par l'utilisateur.
public class ProductionData {

  //Data de production (format texte YYY-MM-DD)
    public String date;

// Identifiant de l'opérateur ayant efffectué la production
    public String operatorId;

   // Nom ou ou referencce de la pièce produite
    public String piece;

   //Quantité des piéces conformes
    public int qtyOK;

   // Quantité des pièces non conformes
    public int qtyKO;

    // Constructeur permettant d'initialiser toutes les données de production
    public ProductionData(String date, String operatorId, String piece, int qtyOK, int qtyKO){
        this.date = date;
        this.operatorId = operatorId;
        this.piece = piece;
        this.qtyOK = qtyOK;
        this.qtyKO = qtyKO;
    }
}
