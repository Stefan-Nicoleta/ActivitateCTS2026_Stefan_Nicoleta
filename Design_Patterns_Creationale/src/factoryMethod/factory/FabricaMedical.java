package factoryMethod.factory;

import factoryMethod.clase.*;
import factoryMethod.enums.TipMedical;

public class FabricaMedical implements FabricaPersonal{


    public PersonalMedical createMedical(TipMedical t,String nume){
        return createMedical(t,nume);
    }


    public PersonalMedical createMedical(TipMedical t){
        switch (t){
            case MEDIC: return new Medic("N");
            case BRANCARDIER: return new Brancardier("N");
            case ASISTENT: return new Asistent("N");
            default: return null;
        }
    }
}
