package ro.ase.cts.facade;

public class Medic {
    public boolean areInregistratPacientul(Pacient pacient){
        return pacient.getGravitate()>5;
    }

}
