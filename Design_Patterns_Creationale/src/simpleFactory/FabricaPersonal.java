package simpleFactory;

public class FabricaPersonal {

    public static Personal createPersonal(TipPersonal tipPersonal){
        switch (tipPersonal){
            case BRANCARDIER : return new Brancardier("Nicoleta");
            case MEDIC : return new Medic(20);
            case ASISTENT : return new Asistent("Carol Davila");
            default: return null;
        }
    }
}
