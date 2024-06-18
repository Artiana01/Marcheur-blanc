package com.example.marcheur.Map;

import java.util.HashMap;
import java.util.Map;

public class Carte {
    private Map<String, Lieu> lieux;

    public Carte() {
        lieux = new HashMap<>();
    }

    public void ajouterLieu(Lieu lieu) {
        lieux.put(lieu.getNom(), lieu);
    }

    public void ajouterRue(String nomLieu1, String nomLieu2) {
        Lieu lieu1 = lieux.get(nomLieu1);
        Lieu lieu2 = lieux.get(nomLieu2);
        if (lieu1 != null && lieu2 != null) {
            Rue rue = new Rue(lieu1, lieu2);
            lieu1.ajouterRueAdjacente(rue);
            lieu2.ajouterRueAdjacente(rue);
        }
    }

    public void PlanCarte() {
        Lieu HEI = new Lieu("HEI");
        Lieu Pullman = new Lieu("Pullman");
        Lieu Balancoire = new Lieu("Balancoire");
        Lieu ESTI = new Lieu("ESTI");
        Lieu Nexta = new Lieu("Nexta");
        Lieu Boulevard = new Lieu("Boulevard");
        Lieu Sekolintsika = new Lieu("Sekolintsika");
        Lieu Marais = new Lieu("Marais");

        ajouterLieu(HEI);
        ajouterLieu(Pullman);
        ajouterLieu(Balancoire);
        ajouterLieu(ESTI);
        ajouterLieu(Nexta);
        ajouterLieu(Boulevard);
        ajouterLieu(Sekolintsika);
        ajouterLieu(Marais);

        ajouterRue("HEI", "Pullman");
        ajouterRue("Pullman", "Nexta");
        ajouterRue("Pullman", "Balancoire");
        ajouterRue("Balancoire", "HEI");
        ajouterRue("Balancoire", "ESTI");
        ajouterRue("Balancoire", "Boulevard");
        ajouterRue("Boulevard", "ESTI");
        ajouterRue("HEI", "Sekolintsika");
        ajouterRue("Sekolintsika", "Marais");
    }

    public Lieu getLieu(String nom) {
        return lieux.get(nom);
    }
}
