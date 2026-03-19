package ro.ase.cts.A_factoryMethod.fabrici;

import ro.ase.cts.A_factoryMethod.clase.FelDeMancare;
import ro.ase.cts.A_factoryMethod.enums.TipFelDeMancare;

public interface FabricaFelDeMancare {
    FelDeMancare creeareFelDeMancare(TipFelDeMancare tipFelDeMancare, int gramaj, double pret);
    FelDeMancare creeareFelDeMancare(TipFelDeMancare tipFelDeMancare, int gramaj, double pret, int calorii);




}
