package cts.stefan.nicoleta.g1096.simplefactory;

public class Ceai extends Bautura {
    public Ceai(String nume, int volum, int pret) {
        super(nume, volum, pret);
    }

    @Override
    public void preparare() {
        System.out.println("Preparare ceai: infuzare ceai");
    }
}
