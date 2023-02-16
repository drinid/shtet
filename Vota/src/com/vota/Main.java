package com.vota;

public class Main {

    public static void main(String[] args) {
        Banori[] banoret = {
                new Banori(14, true),
                new Banori(16, false),
                new Banori(18, true),
                new Banori(19, false),
                new Banori(23, true),
                new Banori(43, false),
                new Banori(80, true)
        };

        Qyteti[] qytetet = {
                new Qyteti("Gjakove", banoret),
                new Qyteti("Prishtine", banoret),
                new Qyteti("Prizren", banoret),
                new Qyteti("Peje", banoret),
        };

        Shteti shteti = new Shteti("Kosove", qytetet);

        int votuesit = shteti.numriIVotueseve();
        int banore = shteti.numriIBanoreveNdermjetMoshes(18, 50);

        System.out.println("Votuesit: " + votuesit);
        System.out.println("Banore: " + banore);
    }
}
