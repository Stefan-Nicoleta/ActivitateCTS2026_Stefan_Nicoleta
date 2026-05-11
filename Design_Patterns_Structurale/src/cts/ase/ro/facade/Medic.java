package cts.ase.ro.facade;

//Clasa Concreta A
public class Medic {
    public boolean trebuieInternat(Pacient pacient){
        return pacient.getGravitate()>5;
    }
}
