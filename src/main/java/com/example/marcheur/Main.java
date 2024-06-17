package com.example.marcheur;

public class Main {
    public static void main(String[] args) {
        Carte carte = new Carte();
        carte.PlanCarte();

        Lieu positionInitiale = carte.getLieu("HEI");
        if (positionInitiale == null) {
            System.out.println("Le lieu de départ n'a pas été trouvé sur la carte.");
            return;
        }

        Marcheur bjarni = new Marcheur(positionInitiale);

        bjarni.marcherAleatoirement(carte, "ESTI");
    }
}
