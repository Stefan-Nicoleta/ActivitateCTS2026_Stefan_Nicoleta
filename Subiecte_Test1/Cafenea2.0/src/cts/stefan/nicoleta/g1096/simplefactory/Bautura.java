package cts.stefan.nicoleta.g1096.simplefactory;

public abstract class Bautura implements IBautura{
     String nume;
     int volum;
     float pret;

    public Bautura(String nume, int volum, float pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bautura{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", volum=").append(volum);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
