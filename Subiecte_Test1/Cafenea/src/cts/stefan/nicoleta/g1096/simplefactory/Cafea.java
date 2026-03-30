package cts.stefan.nicoleta.g1096.simplefactory;

public class Cafea extends Bautura {
    public Cafea(String nume, int volum, int pret) {
        super(nume, volum, pret);
    }


    @Override
    public void preparare() {
        System.out.println("Preparare cafea: macinare boabe si lapte");
    }
}
