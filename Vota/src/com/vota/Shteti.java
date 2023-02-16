package com.vota;

public class Shteti {
    public String emri;
    public Qyteti[] qytetet;

    public Shteti(String emri, Qyteti[] qytetet) {
        this.emri = emri;
        this.qytetet = qytetet;
    }

    public int numriIVotueseve() {
        int votues = 0;
        for (Qyteti qyteti : this.qytetet)
            for (Banori banori : qyteti.banoret)
                if (banori.mosha >= 18)
                    votues++;

        return votues;
    }

    public int numriIBanoreveNdermjetMoshes(int prej, int deri) {
        int banore = 0;
        for (Qyteti qyteti : this.qytetet)
            for (Banori banori : qyteti.banoret)
                if (banori.mosha >= prej && banori.mosha <= deri)
                    banore++;

        return banore;
    }
}
