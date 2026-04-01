package cts.stefan.nicoleta.g1096.simpleFactory;

public class FabricaMesaje {

    public ListaMesaje createMesaj(TipMesaj tipMesaj){
        switch (tipMesaj){
            case POP : return new Pop();
            case ROCK : return new Rock();
            case PUNK : return new Punk();
            default : return null;
        }
    }
}
