package com.example.marcheur;

import com.example.marcheur.Map.Carte;
import com.example.marcheur.Map.Lieu;
import com.example.marcheur.Marcheu.Marcheur;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = MarcheurApplication.class)
class MarcheurApplicationTests {


    @Test
    void testMarcheurReachesDestination3() {

        Carte carte = new Carte();
        carte.PlanCarte();

        Lieu lieuInitial = carte.getLieu("HEI");
        Marcheur marcheur = new Marcheur(lieuInitial);

        marcheur.marcherAleatoirement( "ESTI");
        assertEquals("ESTI", marcheur.getPositionActuelle().getNom());
    }

    @Test
    void testMarcheurReachesDestination1() {
        Carte carte = new Carte();
        carte.PlanCarte();


        Lieu lieuInitial = carte.getLieu("HEI");
        Marcheur marcheur = new Marcheur(lieuInitial);
        marcheur.marcherAleatoirement("Nexta");

        assertEquals("Nexta", marcheur.getPositionActuelle().getNom());
    }

    @Test
    void testMarcheurReachesDestination2() {
        Carte carte = new Carte();
        carte.PlanCarte();
        Lieu lieuInitial = carte.getLieu("HEI");
        Marcheur marcheur = new Marcheur(lieuInitial);

        marcheur.marcherAleatoirement("Marais");

        assertEquals("Marais", marcheur.getPositionActuelle().getNom());
    }

}
