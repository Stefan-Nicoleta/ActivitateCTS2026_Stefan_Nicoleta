package cts.stefan.nicoleta.g1096.singleton.model;

public class Masina extends AMasina{

    public Masina(String marca, String culoare) {
        super(marca, culoare);
    }


    @Override
    public void afisare() {
        System.out.println("Aceasta este o masina");
    }
}
