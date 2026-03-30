package cts.stefan.nicoleta.g1096.simplefactory;

public class CiocolataCalda extends Bautura {
    public CiocolataCalda(String nume, int volum, int pret) {
        super(nume, volum, pret);
    }

    @Override
    public void preparare() {
        System.out.println("Preparare ciocolata calda: praf de ciocolata!");
    }
}
