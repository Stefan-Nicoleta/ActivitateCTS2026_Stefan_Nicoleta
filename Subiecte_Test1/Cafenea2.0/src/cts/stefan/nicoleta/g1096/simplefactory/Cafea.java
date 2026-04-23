package cts.stefan.nicoleta.g1096.simplefactory;

public class Cafea extends Bautura{


    public Cafea(String nume, int volum, float pret) {
        super(nume, volum, pret);
    }

    @Override
    public void metodaPreparare() {
        System.out.println("Ciocolata calda");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cafea{");


        sb.append(super.nume).append(" ");
        sb.append(super.volum).append(" mililitrii ");
        sb.append(super.pret).append(" lei");
        sb.append('}');
        return sb.toString();
    }
}

