package com.example.marcheur.Map;

public class Rue {
    private Lieu lieu1;
    private Lieu lieu2;

    public Rue(Lieu lieu1, Lieu lieu2) {
        this.lieu1 = lieu1;
        this.lieu2 = lieu2;
    }

    public Lieu getAutreLieu(Lieu lieu) {
        if (lieu.equals(lieu1)) {
            return lieu2;
        } else if (lieu.equals(lieu2)) {
            return lieu1;
        }
        return null;
    }
}
