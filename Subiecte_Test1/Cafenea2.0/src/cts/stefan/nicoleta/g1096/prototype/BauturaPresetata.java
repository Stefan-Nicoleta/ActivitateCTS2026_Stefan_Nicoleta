package cts.stefan.nicoleta.g1096.prototype;

import cts.stefan.nicoleta.g1096.simplefactory.Bautura;

public class BauturaPresetata implements AbstractPrototype{
    String nume;
    int volum;
    float pret;

      BauturaPresetata() {
    }

    public BauturaPresetata(String nume, int volum, float pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    public AbstractPrototype clone(){
         BauturaPresetata bauturaPresetata = new BauturaPresetata();
         bauturaPresetata.nume = this.nume;
         bauturaPresetata.volum = this.volum;
         bauturaPresetata.pret = this.pret;
         return bauturaPresetata;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BauturaPresetata{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", volum=").append(volum);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
