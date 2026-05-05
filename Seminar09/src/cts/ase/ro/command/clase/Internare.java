package cts.ase.ro.command.clase;

public class Internare implements IComanda{

    private PersonalSpital medic; //medic sau asistenta
    private Pacient pacient;

    public Internare(PersonalSpital medic, Pacient pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        medic.preluarePacient(pacient);
    }
}
