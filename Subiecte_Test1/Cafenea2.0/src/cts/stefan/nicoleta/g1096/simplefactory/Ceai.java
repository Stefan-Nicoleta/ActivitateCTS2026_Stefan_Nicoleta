package cts.stefan.nicoleta.g1096.simplefactory;

public class Ceai extends Bautura{
    public Ceai(String nume, int volum, float pret) {
        super(nume, volum, pret);
    }

    @Override
    public void metodaPreparare() {
        System.out.println("Ciocolata calda");
    }
}
