package com.example.marcheur.Marcheu;

import com.example.marcheur.Map.Lieu;
import com.example.marcheur.Map.Rue;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Marcheur {
    private Lieu positionActuelle;
    public Marcheur(Lieu positionInitiale) {
        this.positionActuelle = positionInitiale;
    }

    public Lieu getPositionActuelle() {
        return positionActuelle;
    }
    public void marcherAleatoirement(String destination) {
        List<Lieu> visite = new ArrayList<>();
        Random aleatoire = new Random();
        Lieu lieuPrecedent = null;

        visite.add(positionActuelle);

        while (!positionActuelle.getNom().equals(destination)) {
            List<Rue> rues = positionActuelle.getRuesAdjacentes();
            if (rues.isEmpty()) {
                System.out.println("Pas de rues disponibles pour continuer la marche.");
                return;
            }

            List<Lieu> lieuxAccessibles = new ArrayList<>();
            for (Rue rue : rues) {
                Lieu prochainLieu = rue.getAutreLieu(positionActuelle);
                if (!prochainLieu.equals(lieuPrecedent)) {
                    lieuxAccessibles.add(prochainLieu);
                }
            }

            if (lieuxAccessibles.isEmpty()) {
                for (Rue rue : rues) {
                    lieuxAccessibles.add(rue.getAutreLieu(positionActuelle));
                }
            }

            Lieu prochainLieu = lieuxAccessibles.get(aleatoire.nextInt(lieuxAccessibles.size()));

            lieuPrecedent = positionActuelle;
            positionActuelle = prochainLieu;
            visite.add(positionActuelle);
        }

        System.out.print("Marche complétée : ");
        for (int i = 0; i < visite.size(); i++) {
            if (i != 0) {
                System.out.print(" -> ");
            }
            System.out.print(visite.get(i).getNom());
        }
        System.out.println();
    }
}
