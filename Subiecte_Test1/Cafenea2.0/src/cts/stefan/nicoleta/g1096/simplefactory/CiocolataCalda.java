package cts.stefan.nicoleta.g1096.simplefactory;

public class CiocolataCalda extends Bautura{
    public CiocolataCalda(String nume, int volum, float pret) {
        super(nume, volum, pret);
    }

    @Override
    public void metodaPreparare() {
        System.out.println("Ciocolata calda");
    }
}
