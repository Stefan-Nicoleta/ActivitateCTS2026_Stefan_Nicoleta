package cts.stefan.nicoleta.g1096.simplefactory;

public abstract class Bautura implements Cloneable{
    private String nume;
    private int volum;
    private int pret;


    public Bautura(String nume, int volum, int pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVolum() {
        return volum;
    }

    public void setVolum(int volum) {
        this.volum = volum;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    //metoda de preparare
    public abstract void preparare();


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bauturi{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", volum=").append(volum);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }




}
