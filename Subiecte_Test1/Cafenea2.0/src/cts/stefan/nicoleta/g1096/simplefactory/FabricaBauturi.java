package cts.stefan.nicoleta.g1096.simplefactory;

public class FabricaBauturi {
    public static IBautura createBautura(TipBautura tipBautura, String nume, int volum, float pret){
        switch (tipBautura){
            case CEAI: return new Ceai(nume,volum,pret);
            case CAFEA: return new Cafea(nume,volum,pret);
            case CIOCOLATA_CALDA: return new CiocolataCalda(nume,volum,pret);
            default: return null;
        }
    }
}
