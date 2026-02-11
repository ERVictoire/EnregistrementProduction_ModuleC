# TP Java – Système de Gestion de Production
## Module C – Enregistrement Production + Validation (BAC2 IFI ISTA 2025)

## Description
Application Java développée dans le cadre du TP de POO.
Permet de saisir des données de production,
valider les informations,
calculer le taux de défaut
et enregistrer les résultats dans un fichier CSV.

## Fonctionnalités
- Saisie production
- Validation données
- Vérification operatorId
- Calcul total et taux défaut
- Détection anomalie (>5%)
- Enregistrement data/production.csv

## Technologies
- Java 17
- Maven
- IntelliJ IDEA Community


## Structure du projet
```
EnregistrementProduction/ : dossier racine du projet
│
├── data/n : fichers de données
│     ├── operators.txt : ID des opérateures
│     ├── production.csv : enregistrement de production
│     └── report_2026-02-11.txt : exemple de rapport généré
│
├── doc/
│     └── moduleC.md : documentation module 
│
├── src/ : code source
│     └── main/java/net/isata2025/bac2IFI/
│            ├── production/ : package des classes
│            └── Main.java : classe principal de lancement
│
├── .gitignore : ce que github ne dois pas suivre
├── CHANGELOG.md : historique de changement
├── CONTRIBUTING.md : guide de contrubition
├── README.md : instruction d'utilisation 
└── pom.xml : configuration Maven
```

## Compilation

### Option 1 – IntelliJ IDEA
```
Dans Intellij
    Ouvrir le projet
    Ouvrirla classe Main.java
    Clique sur Run
```

### Option 2 – Maven
```
Dans le terminal :
    mvn clean compile
    mvn exec:java
```

## Exécution
```
Exécuter Main.java depuis IntelliJ
```

## INSTRUCTION DE D'EXECUTION
- saisir la date au format AAAA-MM-JJ, si champ vide le programme renvoie erreur
- saisir l'ID de l'orpérateur, l'ID doit exister dans operators.txt, si inexistant ou champ vide le programme renvoie erreur
- saisir Piece, si champ vide le programme renvoie erreur
- saisir Quantité ok, Au moins une valeur doit exister, si négatives ou champ vides le programme renvoie erreur
- le programme signal la cause de chaque erreur avec un message
- si taux de défaut > 5% le programme affiche anomalie detectée
- le resultat de production est stocké dans production.csv

## Exemple de sortie console
```
=== RESULTAT PRODUCTION ===
Total Produit : 129
Taux défaut : 3,88%
Enregistrement csv ok
Report généré dans : data/report_2026-02-11.txt
```


## LISTE DES MEMBRES DU GROUP
```
1. BANZE MUKALA Omega
2. ELONGA RWABAHIZI Victoire
3. KAPEND MUSUNGCharles 
4. FWAMBA NDEKENYA Christvie
5. ILUNGA HUBERT Serge
6. ILUNGA WA KUBANGWE Blaise
```

