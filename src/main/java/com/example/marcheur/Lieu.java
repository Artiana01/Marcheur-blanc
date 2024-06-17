package com.example.marcheur;

import java.util.ArrayList;
import java.util.List;

public class Lieu {
    private String nom;
    private List<Rue> ruesAdjacentes;

    public Lieu(String nom) {
        this.nom = nom;
        this.ruesAdjacentes = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void ajouterRueAdjacente(Rue rue) {
        ruesAdjacentes.add(rue);
    }

    public List<Rue> getRuesAdjacentes() {
        return ruesAdjacentes;
    }
}
