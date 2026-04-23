package cts.stefan.nicoleta.g1096.simpleFactory.model;

import cts.stefan.nicoleta.g1096.singleton.model.AMasina;

public class FabricaMasina {
    public static AMasina createMasina(TipMasina tipMasina){
        switch (tipMasina){
            case SUV : return new Suv("Opel","Rosu");
            case VAN : return new Van("B","f");
            case SEDAN : return new Sedan("N","g");
            default: return null;
        }
    }
}
