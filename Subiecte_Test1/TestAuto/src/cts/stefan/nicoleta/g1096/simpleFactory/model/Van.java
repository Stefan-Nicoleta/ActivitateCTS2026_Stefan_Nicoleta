package cts.stefan.nicoleta.g1096.simpleFactory.model;

import cts.stefan.nicoleta.g1096.singleton.model.AMasina;

public class Van extends AMasina {
    public Van(String marca, String culoare) {
        super(marca, culoare);
    }

    @Override
    public void afisare() {
        System.out.println("Avesta este un van");
    }
}
