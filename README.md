# Module C – Enregistrement Production + Validation (BAC2 IFI ISTA 2025)

## Description
Module C du projet POO Java.  
Fonction : enregistrement des productions avec validations métier et génération du fichier CSV.

## Fonctionnalités
- Saisie production
- Validation données
- Vérification operatorId
- Calcul total et taux défaut
- Détection anomalie (>5%)
- Enregistrement data/production.csv

## DONNEES
Les données sont stockés dans données
    - operators.txt contient les ID des operateurs existant
    - production.csv contient l'"nregistrement de production

lors de la saisi des données, assurez vous que l'ID saisi existe dans data\operators.txt

## Structure
src/main/java/net/ista2025/bac2IFI/
 ├── Main.java
 └── production/

data/
 └── operators.txt

## Lancement
```bash
mvn clean compile
mvn exec:java

## LISTE DES MEMBRES DU GROUP
1. BANZE MUKALA Omega
2. ELONGA RWABAHIZI Victoire
3. KAPEND MUSUNGCharles 
4. FWAMBA NDEKENYA Christvie
5. ILUNGA HUBERT Serge
6. ILUNGA WA KUBANGWE Blaise


