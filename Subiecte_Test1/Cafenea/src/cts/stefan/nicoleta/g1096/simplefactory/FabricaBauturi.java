package cts.stefan.nicoleta.g1096.simplefactory;

public class FabricaBauturi{

    public static Bautura createBauturi(TipBautura tipBautura, String nume, int volum, int pret) throws Exception {
        switch (tipBautura){
            case CAFEA : return new Cafea(nume, volum, pret);
            case CEAI:  return new Ceai(nume, volum, pret);
            case CIOCOLATA_CALDA:  return new CiocolataCalda(nume,volum,pret);
            default: return null;

        }

    }

}
