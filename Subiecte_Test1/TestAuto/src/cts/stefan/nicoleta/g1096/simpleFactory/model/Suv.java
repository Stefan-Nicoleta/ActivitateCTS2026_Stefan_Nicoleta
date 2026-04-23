package cts.stefan.nicoleta.g1096.simpleFactory.model;

import cts.stefan.nicoleta.g1096.singleton.model.AMasina;

public class Suv extends AMasina {
    public Suv(String marca, String culoare) {
        super(marca, culoare);
    }

    @Override
    public void afisare() {
        System.out.println("Acesta este un suv");
    }
}
