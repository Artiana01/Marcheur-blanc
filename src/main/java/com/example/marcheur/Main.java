package com.example.marcheur;

import com.example.marcheur.Map.Carte;
import com.example.marcheur.Map.Lieu;
import com.example.marcheur.Marcheu.Marcheur;

public class Main {
    public static void main(String[] args) {
        Carte carte = new Carte();
        carte.PlanCarte();

        Lieu lieuInitial = carte.getLieu("HEI");
        Marcheur marcheur = new Marcheur(lieuInitial);

        marcheur.marcherAleatoirement("ESTI");

    }
}
