package ro.ase.cts.B1.simpleFactory.fabrici;

import ro.ase.cts.B1.simpleFactory.clase.SupaDeCiuperci;
import ro.ase.cts.B1.simpleFactory.clase.SupaDeLegume;
import ro.ase.cts.B1.simpleFactory.clase.SupaDeVita;
import ro.ase.cts.B1.simpleFactory.clase.Supe;
import ro.ase.cts.B1.simpleFactory.enums.TipSupa;

public class FabricaSupe {


    public Supe createSupa(TipSupa tipSupa) throws Exception {
        switch (tipSupa){
            case LEGUME: return new SupaDeLegume();
            case VITA: return new SupaDeVita();
            case CIUPERCI: return new SupaDeCiuperci();

            default: throw new Exception("Nu exista");
        }
    }


}
