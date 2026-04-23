package cts.stefan.nicoleta.g1096.singleton.model;

import cts.stefan.nicoleta.g1096.simpleFactory.model.IMasina;

public abstract class AMasina implements IMasina {
    private String marca;
    private String culoare;


    private AMasina aMasina = null;

    public AMasina(String marca, String culoare) {
        this.marca = marca;
        this.culoare = culoare;
    }




    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AMasina{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
