package ro.ase.cts.A_factoryMethod.fabrici;

import ro.ase.cts.A_factoryMethod.clase.FelDeMancare;
import ro.ase.cts.A_factoryMethod.clase.SupaDeVita;
import ro.ase.cts.A_factoryMethod.clase.SupeDeLegume;
import ro.ase.cts.A_factoryMethod.enums.TipFelDeMancare;
import ro.ase.cts.A_factoryMethod.enums.TipSupa;

public class FabricaSupa implements FabricaFelDeMancare{
    @Override
    public FelDeMancare creeareFelDeMancare(TipFelDeMancare tipFelDeMancare, int gramaj, double pret) {
        return switch (tipFelDeMancare){
            case TipSupa.SupaDeLegume -> new SupeDeLegume(gramaj,pret);
            case TipSupa.SupaDeVita -> new SupaDeVita(gramaj, pret);
            default -> null;
        };
    }

    @Override
    public FelDeMancare creeareFelDeMancare(TipFelDeMancare tipFelDeMancare, int gramaj, double pret, int calorii) {
        return creeareFelDeMancare(tipFelDeMancare,gramaj,pret,500);
    }
}
