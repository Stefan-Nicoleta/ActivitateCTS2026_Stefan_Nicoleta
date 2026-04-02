package factoryMethod.factory;

import factoryMethod.clase.*;
import factoryMethod.enums.TipMedical;
import factoryMethod.enums.TipNonMedical;

public class FabricaNonMedical implements FabricaPersonal{
    public PersonalNonMedical createNonMedical(TipMedical t, int varsta){
        return createNonMedical(t,varsta);
    }


    public PersonalNonMedical createNonMedical(TipNonMedical t){
        switch (t){
            case PREGISTRATOR:  return new Registrator(20);
            case SECRETAR: return new Secretar(40);
            default: return null;
        }
    }
}
