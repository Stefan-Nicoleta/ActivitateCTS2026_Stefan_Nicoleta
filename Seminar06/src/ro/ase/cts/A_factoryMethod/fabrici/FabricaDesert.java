package ro.ase.cts.A_factoryMethod.fabrici;

import ro.ase.cts.A_factoryMethod.clase.Clatite;
import ro.ase.cts.A_factoryMethod.clase.FelDeMancare;
import ro.ase.cts.A_factoryMethod.clase.Papanasi;
import ro.ase.cts.A_factoryMethod.enums.TipDesert;
import ro.ase.cts.A_factoryMethod.enums.TipFelDeMancare;

public class FabricaDesert implements FabricaFelDeMancare{
    @Override
    public FelDeMancare creeareFelDeMancare(TipFelDeMancare tipFelDeMancare, int gramaj, double pret) {
        return creeareFelDeMancare(tipFelDeMancare,gramaj,pret,100);
    }

    @Override
    public FelDeMancare creeareFelDeMancare(TipFelDeMancare tipFelDeMancare, int gramaj, double pret, int calorii) {
        return switch (tipFelDeMancare){
            case TipDesert.Papanasi -> new Papanasi(calorii,pret,gramaj);
            case TipDesert.Clatite -> new Clatite(calorii,pret,gramaj);
            default -> null;
        };
    }
}
