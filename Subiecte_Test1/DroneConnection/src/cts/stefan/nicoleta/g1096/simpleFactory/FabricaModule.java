package cts.stefan.nicoleta.g1096.simpleFactory;

public class FabricaModule {

    public static AbstractModule createModul(TipModul tipModul, String name, String description, float price){
        switch (tipModul){
            case VEDERE_NOAPTE : return new VedereNoapte(name, description, price, "2", "a");
            case GPS:  return new Gps(name, description, price, 23, "aa");
            case CAMERA_INALTA_REZOLUTIE:  return new CameraInaltaRezolutie(name, description, price, 2345, "a");
            case BATERIE_SUPLIMENTAARA:  return new BaterieSuplimentara(name, description, price, 566, "la");
            default: return null;
        }
    }
}
