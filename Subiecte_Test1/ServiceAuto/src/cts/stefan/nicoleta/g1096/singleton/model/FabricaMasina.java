package cts.stefan.nicoleta.g1096.singleton.model;

public class FabricaMasina {

    public static AMasina createMasina(TipMasina tipMasina, String deumire, String culoare){
        switch (tipMasina){
            case SUV : return new SUV(deumire, culoare);
            case VAN : return new VAN(deumire, culoare);
            case SEDAN:  return new SEDAN(deumire, culoare);
            default: return null;
        }

    }

}
