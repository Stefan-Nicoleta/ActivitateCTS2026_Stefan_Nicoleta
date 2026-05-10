package cts.ase.ro.facade;

public class Medic {
    public boolean trebuieInternat(Pacient pacient){
        return pacient.getGravitate()>5;
    }
}
