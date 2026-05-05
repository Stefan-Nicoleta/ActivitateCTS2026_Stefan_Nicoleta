package cts.ase.ro.command.clase;

public class Tratare implements IComanda{

    private PersonalSpital asistena;
    private Pacient pacient;

    public Tratare(PersonalSpital asistena, Pacient pacient) {
        this.asistena = asistena;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        asistena.preluarePacient(pacient);
    }
}
